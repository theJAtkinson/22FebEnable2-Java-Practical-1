package com.qa.main.taxes;

public class Taxes {
	private int salary;
	private int taxpercent;
	
	public Taxes(int salary) {
		this.salary = salary;
	}
	
	public int getTaxPercent() {
		return taxpercent;
	}
	public void printTaxPercent() {	
		switch(taxpercent) {
		case 0:
			System.out.println("Your tax percentage is: 0%");
			break;
		case 10:
			System.out.println("Your tax percentage is: 10%");
			break;
		case 15:
			System.out.println("Your tax percentage is: 15%");
			break;
		case 20:
			System.out.println("Your tax percentage is: 20%");
			break;
		case 25:
			System.out.println("Your tax percentage is: 25%");
			break;
		}
	}
	public void setTaxPercent() {	
		if(salary < 15000) {
			taxpercent = 0;
		}else if(salary < 20000) {
			taxpercent = 10;
		}else if(salary < 30000) {
			taxpercent = 15;
		}else if(salary < 45000) {
			taxpercent = 20;
		}else {
			taxpercent = 25;
		}
	}
	
	public double getTaxAmount() {
		return salary * ((double)taxpercent/100);
	}
}
