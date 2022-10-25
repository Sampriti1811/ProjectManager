package com.mjunction.prop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mjunction.prop.model.Property;
import com.mjunction.prop.repository.PropertyRepository;
import com.mjunction.prop.service.PropertyService;

@Component("propertyService")
public class PropertyServiceImp implements PropertyService{
	
	@Autowired
	PropertyRepository propertyRepository;

	
	public List<Property> getAll(){
		return (List<Property>)propertyRepository.findAll();	
		}
	
	public Property saveProperty(Property property) {
		return propertyRepository.save(property);
	}

	public void delete(int id) {
		propertyRepository.deleteById(id);
	}
	
	public Property findById(int id) {
		return  propertyRepository.findById(id);
	}
	
	public List<Property> getByType(String prop_type){
		return (List<Property>)propertyRepository.findByType(prop_type);
	}
	
	public List<Property> getByCity(String city){
		return (List<Property>)propertyRepository.findByCity(city);
	}
	


} 