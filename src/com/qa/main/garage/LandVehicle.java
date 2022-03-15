package com.qa.main.garage;

public abstract class LandVehicle extends Vehicle{
	private int numofwheels;
	private int passengers;
	
	public LandVehicle(int id, int numofwheels, int passengers) {
		super(id);
		this.numofwheels = numofwheels;
		this.passengers = passengers;
	}
	
	public int getNumofwheels() {
		return numofwheels;
	}
	public void setNumofwheels(int numofwheels) {
		this.numofwheels = numofwheels;
	}
	public int getPassengers() {
		return passengers;
	}
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}
	

	public String toString() {
		return "\n-----VEHICLE-----\nID: "+getId()+"\nNumber of Wheels: "+numofwheels+"\nPassengers: "+passengers;
	}
}
