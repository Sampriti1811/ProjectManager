package com.mjunction.prop.service;

import java.util.List;

import com.mjunction.prop.model.Customer;


public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
	public List<Customer> getAll();
	/* public String customerLogin(String cust_name, String cust_password); */

}