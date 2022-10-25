package com.mjunction.prop.service;

import java.util.List;

import com.mjunction.prop.model.Property;

public interface PropertyService {

	public List<Property> getAll();
	
	public Property saveProperty(Property property);
	
	public Property findById(int id);
	
	public List<Property> getByType(String prop_type);
	
	public List<Property> getByCity(String city);
	
	public void delete(int id);
	/*
	 * public String getCity(int id);
	 * 
	 * public String getPrice(int id);
	 * 
	 * public String getType(int id);
	 * 
	 * public String getPid(int id);
	 */
}