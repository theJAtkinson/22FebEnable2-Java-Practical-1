package com.qa.main.garage;

public class Runner {
	public static void main(String[] args) {
		Car car = new Car(1,4,1,"Expensive");
		Bicycle bike = new Bicycle(58,true);
		FighterJet plane = new FighterJet(100,1000);
		FighterJet plane1 = new FighterJet(101,1000);
		FighterJet plane2 = new FighterJet(102,1000);
		FighterJet plane3 = new FighterJet(103,1000);
		
		car.sound();
		bike.sound();
		plane.sound();
		
		Garage g = new Garage();
		
		g.addVehicle(bike);
		g.addVehicle(plane);
		g.addVehicle(plane3);
		g.addVehicle(plane2);
		g.addVehicle(plane1);
		g.addVehicle(car);

		
		
//		System.out.println(g.getBillList());
		System.out.println(g);
	
		g.removeVehicle("FighterJet");
//		g.removeVehicle("Car");
		
		System.out.println(g);
		
	}
}
