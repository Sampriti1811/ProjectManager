package com.mjunction.prop.service;

import java.util.List;

import com.mjunction.prop.model.AdminDetail;    
  
public interface AdminService {  
  
    public int saveAdminDetail(AdminDetail adminDetail);  
      
    public int adminLogin(String emailId , String password);  
      
    public List<AdminDetail> getAdminData();  
}  