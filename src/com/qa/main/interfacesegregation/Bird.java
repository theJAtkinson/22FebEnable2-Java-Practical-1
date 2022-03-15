package com.qa.main.interfacesegregation;

public interface Bird {
	//this is garbage interface, doesn't follow interface segregation 
	//Instead use the other interfaces
    public void fly();
    public void layEggs();
}
