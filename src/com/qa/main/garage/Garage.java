package com.qa.main.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	List<Vehicle> garage = new ArrayList<>();
	
	public void addVehicle(Vehicle v) {
		garage.add(v);
	}
	
	public void removeVehicle(Vehicle v) {
		garage.remove(v);
	}
	
	public String getBillList() {
		String out = "-----BILL LIST-----";
		for(Vehicle v : garage) {
			out += v.toString() + "\nBill: " + getBill(v)+"\n";
		}
		return out;
	}
	
	public int getBill(Vehicle v) {//This function is against SOLID principle: S -> Instead have abstract bill method in vehicle to implement per class.
		int bill = 10;
		if(v instanceof AirVehicle ) {
			bill *= 100000;
		}else if(v instanceof LandVehicle) {
			bill *= 10;
		}else if(v instanceof FighterJet) {
			bill *= 54;
		}else if(v instanceof Car) {
			bill *= 450;
		}else if(v instanceof Bicycle) {
			bill *= 2.5;
		}		
		return bill;
	}
	
	public void removeVehicle(int id) {
		List<Vehicle> x = new ArrayList<>();
		for(Vehicle v: garage) {
			if(v.getId() == id) {
				x.add(v);
			}
		}
		for(Vehicle v:x) {
			garage.remove(v);
		}
	}
	
	public void emptyGarage() {
		garage.clear();
	}
	
	public String toString() {
		String out = "\n-----GARAGE-----";
		for(Vehicle v: garage) {
			out +=  v.toString();
		}
		return out;
	}
	
	public void removeVehicle(String type) {
		List<Vehicle> x = new ArrayList<>();
		for(Vehicle v : garage) {
			if(v.getClass().getSimpleName().equals(type)) {
				x.add(v);
			}
		}
		for(Vehicle v:x) {
			garage.remove(v);
		}
	}
}

