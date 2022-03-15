package com.qa.main.extensionbuilder;

public class Penthouse extends Apartment{
	
    private int squareFootage;
    private int numberOfBedrooms;
    
    public Penthouse() {
        this.setNumberOfBedrooms(4);    
    }
    
    @Override
    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
    
    public int getSquareFootage(int sqft) {
    	return squareFootage;
    }
    
    @Override
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

    @Override
	public void setNumberOfBedrooms(int numberOfBedrooms) {
		this.numberOfBedrooms = numberOfBedrooms;
	}
    
}
