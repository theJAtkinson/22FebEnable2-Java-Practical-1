package com.qa.main.calculator;

/**
 * Performs very simple numerical operations and provides a method to display
 * all functions in sequence.
 * 
 * @author Jonah Atkinson
 * @since 2022-03-09
 * @version 1.0
 */
public class Calculator {
	private int int1;
	private int int2;

	public Calculator(int int1, int int2) {
		this.int1 = int1;
		this.int2 = int2;
	}
	
	public int toAdd() {
		return toAdd(int1,int2);
	}
	
	 /** Adds two integers
	 * @return Sum of integer1 and integer2
	 */
	public int toAdd(int integer1, int integer2) {
		return (integer1 + integer2);
	}
	
	public int toMultiply() {
		return toMultiply(int1,int2);
	}
	
	 /** Multiplies two integers
	 * @return multiplication of integer1 and integer2
	 */
	public int toMultiply(int integer1, int integer2) {
		return (integer1 * integer2);
	}
	
	public int toSubtract() {
		return toSubtract(int1,int2);
	}
	
	 /** Subtracts one integer from another
	 * @return integer2 subtracted from integer1
	 */
	public int toSubtract(int integer1, int integer2) {
		return (integer1 - integer2);
	}
	
	public double toDivide() {
		return toDivide((double)int1, (double)int2);
	}
	
	 /** Divides one integer by another
	 * @return integer2 divided by integer1
	 */
	public double toDivide(double integer1, double integer2) { 
			return (integer1 / integer2);
	}
	
	public void doSums() {
		doSums(int1,int2);
	}
	
	/**
	 * Prints out the four calculations in the class in sequence.
	 * @param A integer 1
	 * @param B integer 2
	 */ 
	public void doSums(int A, int B) {
		System.out.println(A+""+B+"="+toAdd(A,B));	
		System.out.println(A+"*"+B+"="+toMultiply(A,B));
		System.out.println(A+"-"+B+"="+toSubtract(A,B));
		System.out.println(A+"/"+B+"="+toDivide(A,B));
	}
	

}
