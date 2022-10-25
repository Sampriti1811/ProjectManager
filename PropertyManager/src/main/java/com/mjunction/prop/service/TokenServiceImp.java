package com.mjunction.prop.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjunction.prop.repository.TokenRepository;

@Service("tokenService")  
public class TokenServiceImp implements TokenService{

	@Autowired  
    private TokenRepository tokenDAO;  
      
    @Transactional  
    public void saveUserEmail(String email, int adminId) {  
        tokenDAO.saveUserEmail(email, adminId);  
    } 
    
    @Transactional  
    public boolean updateToken(String email, String authenticationToken, String secretKey) {  
        return tokenDAO.updateToken(email, authenticationToken, secretKey);  
    }  
  
    @Transactional  
    public int getTokenDetail(String email) {  
        return tokenDAO.getTokenDetail(email);  
    }  
  
    @Transactional  
    public int tokenAuthentication(String token, int emailId) {  
        return tokenDAO.tokenAuthentication(token, emailId);  
    } 
}
