package com.qa.main.extensionbuilder;

public class Studio extends Apartment{
	
    private int squareFootage;
    private int numberOfBedrooms;
    
    public Studio() {
        this.numberOfBedrooms = 0;      
    }

    public void setSquareFootage(int sqft) {
        this.squareFootage = sqft;
    }
    
    @Override
    public int getSquareFootage() {
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
