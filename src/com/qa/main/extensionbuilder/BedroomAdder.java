package com.qa.main.extensionbuilder;

public class BedroomAdder {
	
	public void addBedroom(Penthouse apartment) {
        apartment.setSquareFootage(apartment.getNumberOfBedrooms() + 1);
    }
}
