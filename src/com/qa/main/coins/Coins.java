package com.qa.main.coins;

public class Coins {
	private double cost;
	private double amount;
	
	public Coins(double cost, double amount) {
		this.cost = cost;
		this.amount = amount;
	}
	
	public void getChange() {
		double i = amount-cost;
		int fifties = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int twos = 0;
		int ones = 0;
		int pence50 = 0;
		int pence20 = 0;
		int pence10 = 0;
		int pence5 = 0;
		int pence2 = 0;
		int pence1 = 0;
		
		while(i != 0) {
			
			if((int)i/50 > 0) {
				fifties++;
				i -=50;
			}else if((int)i/20 >= 1){
				twenties++;
				i-=20;
			}else if((int)i/10 >= 1) {
				tens++;
				i-=10;
			}else if((int)i/5 >= 1) {
				fives++;
				i-=5;
			}else if((int)i/2 >= 1) {
				twos++;
				i-=2;
			}else if((int)i/1 >= 1){
				ones++;
				i-=1;
			}else if(i/0.5 >= 1){
				pence50++;
				i-=0.5;
			}else if(i/0.2 >= 1){
				pence20++;
				i-=0.2;
			}else if(i/0.1 >= 1){
				pence10++;
				i-=0.1;
			}else if(i/0.05 >= 1){
				pence5++;
				i-=0.05;
			}else if(i/0.019 >= 1){
				pence2++;
				i-=0.02;
			}else if(i/0.009 >= 1){
				pence1++;
				i-=0.01;
			}else {
				i = 0;
			}
			
		}
		System.out.println("Customer receives: ");
		System.out.println("£50 notes: "+fifties);
		System.out.println("£20 notes: "+twenties);
		System.out.println("£10 notes: "+tens);
		System.out.println("£5 notes: "+fives);
		System.out.println("£2 coins: "+twos);
		System.out.println("£1 coins: "+ones);
		System.out.println("50p coins: "+pence50);
		System.out.println("20p coins: "+pence20);
		System.out.println("10p coins: "+pence10);
		System.out.println("5p coins: "+pence5);
		System.out.println("2p coins: "+pence2);
		System.out.println("1p coins: "+pence1);

	}
}
