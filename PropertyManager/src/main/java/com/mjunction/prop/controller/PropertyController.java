package com.mjunction.prop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mjunction.prop.model.Property;
import com.mjunction.prop.service.PropertyService;

@RestController
@CrossOrigin(origins="http://localhost:4200", allowedHeaders = "*", exposedHeaders = "Authorization")
@RequestMapping("/property")
public class PropertyController {

	@Autowired
	private PropertyService propertyService;

	// get all properties
	@RequestMapping("/viewproperty")
	public List<Property> viewProperty() {
		return propertyService.getAll();
	}

	// add property
	@PostMapping("/addproperty")
	public void saveProperty(@RequestBody Property property) {
		propertyService.saveProperty(property);
	}

	// get property by id
	@GetMapping("/getall/{id}")
	public Property getPropertyById(@PathVariable int id) {
		return propertyService.findById(id);
	}

	//delete property 
	 @DeleteMapping(value="/deleteproperty/{id}")
	 public void delete(@PathVariable int id) 
	 { 
		 propertyService.delete(id);  
	 }
	 
	// get property by type
	@GetMapping("/proptype/{prop_type}")
	public List<Property> getByType(@PathVariable String prop_type) 
	{
		return propertyService.getByType(prop_type);
	}
	
	//get property by city
	@GetMapping("/city/{city}")
	public List<Property> getByCity(@PathVariable String city){
		return propertyService.getByCity(city);
	}
	//update property rest api
	 @PutMapping("/edit/{id}")
	 public ResponseEntity<Property> updateProperty(@PathVariable int id,@RequestBody Property propertyDetails)
	 {
	 Property property= propertyService.findById(id);
	 
	 //property.setProp_id(propertyDetails.getProp_id());
	 property.setProp_type(propertyDetails.getProp_type());
	 property.setOffer_type(propertyDetails.getOffer_type());
//	 property.setCity(propertyDetails.getCity());
	 property.setPrice(propertyDetails.getPrice());

	 propertyService.saveProperty(property);
	 Property updatedProperty= propertyService.saveProperty(property);
	 return ResponseEntity.ok(updatedProperty);
	 
	 }

}
