package com.mjunction.prop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "cust_id")
	private int cust_id;
	
	@Column(name = "cust_name")
	private String cust_name;
	
	@Column(name="cust_age")
	private String cust_age;
	
	@Column(name="cust_gender")
	private String cust_gender;
	
	@Column(name="cust_pass")
	private String cust_password;
	
	@Column(name ="cust_email")
	private String cust_email;
	
	@Column(name="cust_phno")
	private long cust_phno;
	
	@Column(name="cust_aadhar")
	private String aadhar_no;
	

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int cust_id, String cust_name, String cust_age, String cust_gender, String cust_password,
			String cust_email, long cust_phno, String aadhar_no) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_age = cust_age;
		this.cust_gender = cust_gender;
		this.cust_password = cust_password;
		this.cust_email = cust_email;
		this.cust_phno = cust_phno;
		this.aadhar_no = aadhar_no;
	}
	public int getCust_id() {
		return cust_id;
	}
	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_age() {
		return cust_age;
	}
	public void setCust_age(String cust_age) {
		this.cust_age = cust_age;
	}
	public String getCust_gender() {
		return cust_gender;
	}
	public void setCust_gender(String cust_gender) {
		this.cust_gender = cust_gender;
	}
	public String getCust_password() {
		return cust_password;
	}
	public void setCust_password(String cust_password) {
		this.cust_password = cust_password;
	}
	public String getCust_email() {
		return cust_email;
	}
	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}
	public long getCust_phno() {
		return cust_phno;
	}
	public void setCust_phno(long cust_phno) {
		this.cust_phno = cust_phno;
	}
	public String getAadhar_no() {
		return aadhar_no;
	}
	public void setAadhar_no(String aadhar_no) {
		this.aadhar_no = aadhar_no;
	}
	
	

}