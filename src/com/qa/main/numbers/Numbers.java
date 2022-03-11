package com.qa.main.numbers;

public class Numbers {
	
	public int addDigits(int int1) {
		
		if(int1 < 10 || int1 > 99) {
			System.out.println("Out of scope input");
			return 0;
		}
		
		int digit1 = int1/10;
		int digit2 = int1%10;
		
		return digit1+digit2;
	}
	
	public String representInt(int int1) throws IllegalArgumentException{
		if(int1 < 0 || int1 > 99) {
			throw new IllegalArgumentException("Value has to be between 0 and 99");
		}
		
		// Split two digit value into tens and unit
		int digit1 = int1/10;
		int digit2 = int1%10;
		
		
		if(((Integer)digit1).equals(0)) { //This part is for 0-9 
			return units(digit2);
		}else if(((Integer)digit1).equals(1)){ //This part is for 10-19 as they are unique in 0-99
			switch(digit2) {
			case 0:
				return "ten";
			case 1:
				return "eleven";
			case 2:
				return "twelve";
			case 3:
				return "thirteen";
			case 4:
				return units(digit2)+"teen";
			case 5:
				return "fifteen";
			case 6:
				return units(digit2)+"teen";
			case 7:
				return units(digit2)+"teen";
			case 8:
				return "eighteen";
			case 9:
				return units(digit2)+"teen";
			default: return "10-20 whoopsie";	
			} 	
		}else if(((Integer)digit2).equals(0)){ // Multiples of 10 have no unit (slightly redundant but deletes trailing " ")
			return tens(digit1);
		}else {
			return tens(digit1)+" "+units(digit2); //All other cases utilize tens and units methods.
		}
	}
	
	/**
	 * Strings the single digit unit int.
	 * @param int1
	 * @return String equivalent of integer input
	 */
	public String units(int int1) {
		switch(int1) {
		case 0:
			return "";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default: 
			return "units whoopsie";
		}
	}
	
	/**
	 * Strings the single digit tens value int.
	 * @param int1
	 * @return String equivalent of integer input
	 */
	public String tens(int int1) {
		switch(int1) {
		case 0:
			return "";
		case 2:
			return "twenty";
		case 3:
			return "thirty";
		case 4:
			return "fourty";
		case 5:
			return "fifty";
		case 6:
			return "sixty";
		case 7:
			return "seventy";
		case 8:
			return "eighty";
		case 9:
			return "ninety";
		default:
			return "tens whoopsie";
		}
		
	}
	
	public String representIntPlus(int int1) throws IllegalArgumentException{
		
		if(int1 < 0 || int1 > 999) {
			throw new IllegalArgumentException("Value has to be between 0 and 999");
		}
		
		//Split into hundreds and everything else.
		int digit1 = int1/100; 
		int therest = int1%100;
		
		if(((Integer)digit1).equals(0)) { 	//Case where 0-99
			return representInt(int1);		//Simply call 0-99 method.
		}else {
			return units(digit1)+" hundred "+representInt(therest); //as hundreds follow same rule as our units method provides, utilize that and remainder is easy.
		}
	}
	
	public String representIntPlusPlus(int int1) throws IllegalArgumentException {
		
		if(int1 < 0 || int1 > 999) {
			throw new IllegalArgumentException("Value has to be between 0 and 999");
		}
		
		//Split into thousands and everything else.
		int digit1 = int1/1000; 
		int therest = int1%1000;
		
		if(((Integer)digit1).equals(0)) {		//Case where 0-999
			return representIntPlus(therest);	//Simply call 0-999 method.
		}else {
			return units(digit1)+" thousand "+representIntPlus(therest);	//Similarly to 0-999 method, units method provides thousand.
		}
	}
}

