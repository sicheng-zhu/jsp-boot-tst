package com.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

// When creating the project, a standard entity model was created with JPA for the members.
// H2 DB was used in the project. Since the DB is a memory DB, the data will be lost when the server is stopped.
@Entity							
public class User {				

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String firstname;
	private String lastname;
	private String address;
	
	public User() {
		super();
	}
	
	public User(String firstname, String lastname, String address) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
	}		
		
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}