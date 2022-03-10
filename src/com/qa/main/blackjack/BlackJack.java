package com.qa.main.blackjack;

public class BlackJack {
	
	public static int play(int int1, int int2) {
		
		if (int1 > 21 && int2 > 21) {
			return 0;
		}else if(int1 >= int2 && int1 <= 21) {
			return int1;
		}else if(int2 >= int1 && int2 <= 21){
			return int2;
		}else if(int1 > 21){
			return int2;
		}else if(int2 > 21) {
			return int1;
		}else {
			System.out.println("Whoopsie");
			return 22;
		}
	}	
}
