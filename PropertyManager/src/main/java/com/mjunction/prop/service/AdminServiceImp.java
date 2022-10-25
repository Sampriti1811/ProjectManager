package com.mjunction.prop.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mjunction.prop.model.AdminDetail;
import com.mjunction.prop.repository.*;

@Service("adminService")
public class AdminServiceImp implements AdminService{
	
	@Autowired
	private AdminRepository adminDAO;
	
	@Transactional
	public int saveAdminDetail(AdminDetail adminDetail) {
		return adminDAO.saveAdminDetail(adminDetail);
	}
	
	@Transactional
	public int adminLogin(String emailId, String password) {
		return adminDAO.adminLogin(emailId, password);
	}
	
	@Transactional
	public List<AdminDetail> getAdminData(){
		return adminDAO.getAdminData();
	}

}