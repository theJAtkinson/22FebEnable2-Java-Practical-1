package com.qa.main;

/**
 * A simple class that either prints "Hello World!" 
 * or returns "Hello World!" depending on function called.
 * 
 * @author Jonah Atkinson
 * @version 1.0
 * @since 2022-03-08
 */
public class HelloWorld {

	/**
	 * Simple method to print Hello World to console.
	 */
	public static void printMsg() {

		System.out.println("Hello World!");
	}
	
	/**
	 * Simple method to return Hello World!
	 * 
	 * @return String returns Hello World!
	 */
	public static String returnMsg() {

		return "Hello World!";
	}
	/**
	 * Simple method to return input string.
	 * @param msg : a string input to be returned
	 * @return The string input
	 */
	public static String returnMsg(String msg) {
		return msg;
	}
	/**
	 * Simple method to print input string.
	 * @param msg : a string input to be printed
	 */
	public static void printMsg(String msg) {
		System.out.println(msg);
	}
	
}
