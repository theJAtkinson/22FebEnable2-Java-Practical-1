package com.qa.main.calculator;
import java.util.Scanner;

public class ScannerCalculator {
	
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void toAdd() {
		System.out.println("----- Addition -----");
		System.out.println("First value: ");
		int int1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Second value: ");
		int int2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println(int1 + " + " + int2 + " = " + (int1+int2));
		System.out.println("--------------------");
	}
	
	public static void toSubtract() {
		System.out.println("----- Subtraction -----");
		System.out.println("First value: ");
		int int1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Second value: ");
		int int2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println(int1 + " - " + int2 + " = " + (int1-int2));
		System.out.println("--------------------");
	}
	
	public static void toMultiply() {
		System.out.println("----- Multiplication -----");
		System.out.println("First value: ");
		int int1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Second value: ");
		int int2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println(int1 + " * " + int2 + " = " + (int1*int2));
		System.out.println("--------------------");
	}
	
	public static void toDivide() {
		System.out.println("----- Division -----");
		System.out.println("First value: ");
		int int1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Second value: ");
		int int2 = scanner.nextInt();
		scanner.nextLine();
		
		float result = ((float) int1)/((float) int2);
		System.out.println(int1 + " / " + int2 + " = " + (result));
		System.out.println("--------------------");
	}
	
	public static void calc() {
		System.out.println("----- Choose Calculation -----");
		System.out.println("Input: A -> Add");
		System.out.println("Input: S -> Subtract");
		System.out.println("Input: M -> Multiply");
		System.out.println("Input: D -> Divide");
		System.out.println("Calculation type: ");
		
		String calc = scanner.nextLine();
		
		if(calc.equals("A") | 
		"S".equals(calc) | 
		"M".equals(calc) |
		"D".equals(calc)){
			switch(calc) {
			case "A":
				toAdd();
			case "S":
				toSubtract();
			case "M":
				toMultiply();
			case "D":
				toDivide();
			}
		}else {
			System.out.println("Calculation type out of scope.");
		}
	}
}
