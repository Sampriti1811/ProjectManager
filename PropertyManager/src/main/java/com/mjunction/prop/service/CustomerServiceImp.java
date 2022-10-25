package com.mjunction.prop.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mjunction.prop.model.Customer;
import com.mjunction.prop.repository.CustomerRepository;

@Component("customerService")
public class CustomerServiceImp implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	public Customer saveCustomer(Customer customer) {
		System.out.println(" name " +customer.getCust_name());
		return customerRepository.save(customer);
	}
	
	public List<Customer> getAll(){
		return (List<Customer>)customerRepository.findAll();	
	}

}