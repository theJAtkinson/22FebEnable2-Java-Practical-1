package com.qa.main.garage;

public class FighterJet extends AirVehicle{
	private int ammo;
	
	public FighterJet(int id, int ammo) {
		super(id,2);
		this.ammo = ammo;
	}
	
	public void sound() {
		System.out.println("Zoooooom!");
	}
	
	public void speed() {
		System.out.println("Super fast!");
	}
	
	public int getNumOfWings() {
		return super.getNumofwings();
	}
	
	public void fireGuns() {
		if(ammo >= 0) {
			System.out.println("Pew pew pew!");
		}else {
			System.out.println("click click click");
		}
	}
	
	public String toString() {
		return super.toString()+"\nAmmo Count: "+ammo;
	}
}
