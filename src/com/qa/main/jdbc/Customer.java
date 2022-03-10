package com.qa.main.jdbc;

public class Customer {
	private String fname;
	private String lname;
	
	public Customer(String fname,String lname) {
		this.fname = fname;
		this.lname = lname;
	}
	
	public String getFirstName() {
		return fname;
	}
	
	public String getSurname() {
		return lname;
	}
}
