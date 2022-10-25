package com.mjunction.prop.repository;

import java.util.List;

import com.mjunction.prop.model.AdminDetail;

public interface AdminRepository {
	
	public int saveAdminDetail(AdminDetail adminDetail);  
    
    public int adminLogin(String emailId , String password);  
      
    public List<AdminDetail> getAdminData();  

}