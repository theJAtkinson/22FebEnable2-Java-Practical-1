package com.qa.main.garage;

public abstract class Vehicle {
	private int idd;
	public abstract void sound();
	public abstract void speed();
	
	public Vehicle(int idd) {
		this.idd = idd;
	}
	
	public int getId() {
		return idd;
	}
	public void setId(int id) {
		this.idd = id;
	}
}
