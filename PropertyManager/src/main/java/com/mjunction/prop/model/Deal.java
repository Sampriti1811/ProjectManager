package com.mjunction.prop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Deal")
public class Deal {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="cust_id")
	private int custID;
	@Column(name="property_id")
	private int propertyID;
	@Column(name="property_type")
	private String propertyType;
	@Column(name="city")
	private String city;
	@Column(name="price")
	private String price;
	
	public Deal() {
		super();
	}
	public Deal(int custID, int propertyID, String propertyType, String city, String price) {
		super();
		this.custID = custID;
		this.propertyID = propertyID;
		this.propertyType = propertyType;
		this.city = city;
		this.price = price;
	}
	public int getCustID() {
		return custID;
	}
	public void setCustID(int custID) {
		this.custID = custID;
	}
	public int getPropertyID() {
		return propertyID;
	}
	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
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