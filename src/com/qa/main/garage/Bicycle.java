package com.qa.main.garage;

public class Bicycle extends LandVehicle{
	private boolean hasbell;
	
	public Bicycle(int id, boolean hasbell) {
		super(id,2,0);
		this.hasbell = hasbell;
	}
	
	public void speed() {
		System.out.println("Pretty slow");
	}
	
	public void sound() {
		if(hasbell) {
			System.out.println("Rinnnggg!");
		}else {
		System.out.println("swoosh");
		}
	}

	public boolean isHasbell() {
		return hasbell;
	}

	public void setHasbell(boolean hasbell) {
		this.hasbell = hasbell;
	}
	
	public String toString() {
		return super.toString()+"\nHas Bell: "+hasbell;
	}
}
