package com.qa.main.garage;

public abstract class AirVehicle extends Vehicle{
	private int numofwings;
	
	public AirVehicle(int id, int numofwings) {
		super(id);
		this.numofwings = numofwings;
	}

	public int getNumofwings() {
		return numofwings;
	}

	public void setNumofwings(int numofwings) {
		this.numofwings = numofwings;
	}

	
	public String toString() {
		return "\n-----VEHICLE-----\nID: "+ getId() + "\nNumber of Wings: " + numofwings;
	}
}
