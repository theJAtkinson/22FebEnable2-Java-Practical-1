package com.qa.main.calculator;

public class InappropriateDividerException extends Exception{
	
	public InappropriateDividerException() {
		super("Dividing by a greater number is extremely inappropriate");
	}
}
