package com.mjunction.prop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mjunction.prop.model.AdminDetail;
import com.mjunction.prop.model.GenerateToken;
import com.mjunction.prop.service.AdminService;
import com.mjunction.prop.service.TokenService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*", exposedHeaders = "Authorization")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private TokenService tokenService;
	
	GenerateToken generateToken = new GenerateToken();
	
	@PostMapping("/saveAdmin")
	public int saveAdminDetail(@RequestBody AdminDetail adminDetail) {
		return adminService.saveAdminDetail(adminDetail);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Integer> login(@RequestBody AdminDetail adminDetail){
		int status;  
        HttpHeaders httpHeader = null; 
        status = adminService.adminLogin(adminDetail.getEmailId(), adminDetail.getPassword());  
        if(status>0) {
        	String tokenData[] = generateToken.createJWT(adminDetail.getEmailId(), "JavaTpoint", "JWT Token",  
        			adminDetail.getRole(), 43200000);
        	String token = tokenData[0];  
            System.out.println("Authorization :: " + token);
            httpHeader = new HttpHeaders();
            httpHeader.add("Authorization", token);
            long isUserEmailExists = tokenService.getTokenDetail(adminDetail.getEmailId()); 
            if (isUserEmailExists > 0) {  
                tokenService.updateToken(adminDetail.getEmailId(), token, tokenData[1]);  
            }   
            else {  
                tokenService.saveUserEmail(adminDetail.getEmailId(), status);  
                tokenService.updateToken(adminDetail.getEmailId(), token, tokenData[1]);  
            }  
            return new ResponseEntity<Integer>(status, httpHeader, HttpStatus.OK);  
        }
        else {  
            return new ResponseEntity<Integer>(status, httpHeader, HttpStatus.OK);  
        } 
	}
	
	@GetMapping("/getAdminData/{adminId}")
	public List<AdminDetail> getAdminData(@PathVariable int adminId, @RequestHeader("Authorization") String authorizationToken)  
    {  
        String token[] = authorizationToken.split(" ");  
        int result = tokenService.tokenAuthentication(token[1], adminId);  
          
        if (result > 0) {  
            return adminService.getAdminData();  
        } else {  
            return null;  
        }  
    }
}