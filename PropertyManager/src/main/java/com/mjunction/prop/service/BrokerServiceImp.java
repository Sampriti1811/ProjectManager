package com.mjunction.prop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mjunction.prop.model.Broker;
import com.mjunction.prop.model.Customer;
import com.mjunction.prop.repository.BrokerRepository;

@Component("brokerService")
public class BrokerServiceImp implements BrokerService {

	@Autowired
	BrokerRepository brokerRepository;
	
	public void add(Broker broker) {
		brokerRepository.save(broker);
	}
	public List<Broker> getAll(){
		return (List<Broker>)brokerRepository.findAll();	
	}

	

	public String brokerLogin(String br_username,String br_password) {
		
		if(!(brokerRepository.findByUserName(br_username).isPresent())) {
			return "unp";
		}
		
		return "True";
	}
}
