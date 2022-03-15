package com.qa.main.garage;

public class Car extends LandVehicle{
	private String make;
	
	public Car(int id, int numofwheels, int passengers,String make) {
		super(id, numofwheels, passengers);
		this.make = make;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public void sound() {
		System.out.println("Vroom!");
	}
	
	public void speed() {
		System.out.println("Sort of fast");
	}
	
	public String toString() {
		return super.toString()+"\nCar Make: "+make;
	}
}
