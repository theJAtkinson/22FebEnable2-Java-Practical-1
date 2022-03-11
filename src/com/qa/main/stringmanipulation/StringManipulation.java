package com.qa.main.stringmanipulation;

import java.util.*;

public class StringManipulation {
	protected String str1 =  "yesterday it was raining";
	protected String str2 = "today it is sunny";
	
	public String taskOneI() {
		return str2.toUpperCase() + ", "+ str1.toUpperCase();
	}
	
	public String taskOneII() {
		return (str2.substring(0, 12) + str1.substring(17)).toUpperCase();
	}
	
	public int methodOne(String str) throws IllegalArgumentException{
		int numOfWords = 1;
		if(str.substring(0, 1).equals(" ") || str.substring(str.length()-1, str.length()).equals(" ")) {
			numOfWords = 0;
			throw new IllegalArgumentException("String inputs cannot start or end with ' '");
		}else {
			for(int i = 0;i<str.length();i++) {
				if(str.substring(i,i+1).equals(" ")) {
					numOfWords++;
				}
			}
		}
		return numOfWords;
	}
	
	public void methodTwo(String str) throws IllegalArgumentException {
		int startOfWord = 0;
		if(str.substring(0, 1).equals(" ") || str.substring(str.length()-1).equals(" ")) {
			throw new IllegalArgumentException("String inputs cannot start or end with ' '");
		}else {		
			for(int i = 0;i<str.length();i++) {
				if(str.substring(i,i+1).equals(" ")) {
					System.out.println(str.substring(startOfWord, i));
					startOfWord = i+1;
				}
			}
			System.out.println(str.substring(startOfWord, str.length()));
		}
	}
	
	public void methodThree(String str) throws IllegalArgumentException {
		
		int endOfWord = str.length(); //set end of last word (not inclusive for substring)
		// Check to see if spaces exist at beginning and end
		if(str.substring(0, 1).equals(" ") || str.substring(str.length()-1).equals(" ")) {
			throw new IllegalArgumentException("String inputs cannot start or end with ' '");
		}else {		
			for(int i = str.length();i>0;i--) { //iterate backwards through string length
				if(str.substring(i-1,i).equals(" ")) { // if a space is found
					System.out.println(str.substring(i, endOfWord)); //print word
					endOfWord = i-1; //update to end of new word
				}
			}
			System.out.println(str.substring(0, endOfWord));//print first word
		}
	}
	
	public boolean methodFour(String strMsg, String strFind) {
		boolean out = false; //output 
		for(int i = 0; i < strMsg.length() - strFind.length() + 1; i++) {
			for(int j = 0; j < strFind.length(); j++) {
				if(!strMsg.substring(i+j,i+j+1).equals(strFind.substring(j,j+1))) {
					break;
				}else if(j == strFind.length()-1) {
					out = true;
				}
			}
		}
		return out;
	}
	
	public int methodOneV2(String str) { //Use .split() to create a String[] is far more efficient.
		int wordcount = 1;
		if (str.startsWith(" ") || str.endsWith(" ")) {
			System.out.println("String not in correct format");
			return 0;
		}else {
			for(char ch : str.toCharArray()) {
				if(ch == ' ') {
					wordcount++;
				}
			}
		}
		return wordcount;
		
	}
	
	public void methodTwoV2(String str) {
		System.out.println(str.replace(' ', '\n'));
	}
	
	public void methodThreeV2(String str) { //See methodOneV2 comment.
		if (str.startsWith(" ") || str.endsWith(" ")) {
			System.out.println("String not in correct format");
		}
		
		List<String> stringlist = new ArrayList<>();
		StringBuilder cache = new StringBuilder();
		
		for(char ch: str.toCharArray()) {
			if(ch == ' ') {
				stringlist.add(cache.toString());
				cache.setLength(0);
			}else {
				cache.append(ch);
			}
		}
		stringlist.add(cache.toString());
		cache.setLength(0);
		
		Collections.reverse(stringlist);
		
		for(String out : stringlist) {
			System.out.println(out);
		}
	}

	public boolean methodFourV2(String strmsg, String strfind) {
		return strmsg.contains(strfind);
	}
}

