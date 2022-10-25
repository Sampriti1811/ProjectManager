package com.mjunction.prop.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mjunction.prop.model.Customer;
import com.mjunction.prop.repository.CustomerRepository;
import com.mjunction.prop.service.CustomerService;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*", exposedHeaders = "Authorization")
@RequestMapping
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/view")
	public List<Customer> viewCustomer() {
		return customerService.getAll();
	}
	
	//add customer
	@PostMapping("/addcustomer")
	public void saveCustomer(@RequestBody Customer customer) {
		System.out.println("Customer"+customer.getCust_name());
		customerService.saveCustomer(customer);
	}

	
}