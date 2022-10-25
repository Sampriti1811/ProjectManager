package com.mjunction.prop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="property")
public class Property {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String prop_id;
	private String prop_type;
	private String offer_type;
	private String city;
	private String price;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Property() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Property(String prop_id, String prop_type, String offer_type, String city, String price) {
		super();
		this.prop_id = prop_id;
		this.prop_type = prop_type;
		this.offer_type = offer_type;
		this.city = city;
		this.price = price;
	}



	/*
	 * public Property(int id, String prop_id, String prop_type, String offer_type,
	 * String city, String price) { super(); this.id = id; this.prop_id = prop_id;
	 * this.prop_type = prop_type; this.offer_type = offer_type; this.city = city;
	 * this.price = price; }
	 */



	public String getProp_id() {
		return prop_id;
	}



	public void setProp_id(String prop_id) {
		this.prop_id = prop_id;
	}



	public String getProp_type() {
		return prop_type;
	}

	public void setProp_type(String prop_type) {
		this.prop_type = prop_type;
	}

	public String getOffer_type() {
		return offer_type;
	}

	public void setOffer_type(String offer_type) {
		this.offer_type = offer_type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
	

}