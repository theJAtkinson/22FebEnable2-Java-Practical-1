package com.qa.main.runner;

import com.qa.main.helloworld.HelloWorld;
import com.qa.main.coins.*;
import com.qa.main.numbers.*;

public class Runner {

	public static void main(String[] args) {
		
//		HelloWorld.printMsg();
//		HelloWorld.printMsg("Helloer Worlder!");
		
//		Coins coins = new Coins(0.07,0.1);
//		coins.getChange();
		
		Numbers a = new Numbers();
		
//		System.out.println(a.addDigits(98));
		System.out.println(a.representIntPlusPlus(130));
		
//		for(int i = 0; i < 100; i++) {
//			System.out.println(a.representInt(i));
//		}
	}

}
