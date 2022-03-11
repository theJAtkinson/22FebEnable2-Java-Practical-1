package com.qa.main.jdbc;

public class Customer {
	private String fname;
	private String lname;
	private Long id;
	
	public Customer(String fname,String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public Customer(Long id, String fname, String lname) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFirstName() {
		return fname;
	}
	
	public String getSurname() {
		return lname;
	}
	
	public Long getId() {
		return id;
	}
}
