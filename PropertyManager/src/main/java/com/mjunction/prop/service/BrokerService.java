package com.mjunction.prop.service;

import java.util.List;

import com.mjunction.prop.model.Broker;
import com.mjunction.prop.model.Customer;

public interface BrokerService {

	public void add(Broker broker);
	public List<Broker> getAll();
	public String brokerLogin(String br_username,String br_password);
}
