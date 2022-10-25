package com.mjunction.prop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="broker")
public class Broker {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String br_id;
	private String br_username;
	private String br_password;
	
	
	public Broker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Broker(String br_id, String br_username, String br_password) {
		super();
		this.br_id = br_id;
		this.br_username = br_username;
		this.br_password = br_password;
	}



	public Broker(int id, String br_id, String br_username, String br_password) {
		super();
		this.id = id;
		this.br_id = br_id;
		this.br_username = br_username;
		this.br_password = br_password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBr_id() {
		return br_id;
	}
	public void setBr_id(String br_id) {
		this.br_id = br_id;
	}
	public String getBr_username() {
		return br_username;
	}
	public void setBr_username(String br_username) {
		this.br_username = br_username;
	}
	public String getBr_password() {
		return br_password;
	}
	public void setBr_password(String br_password) {
		this.br_password = br_password;
	}
	
	
	
}
