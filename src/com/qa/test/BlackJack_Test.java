package com.qa.test;

import org.junit.Test;
import com.qa.main.blackjack.*;
import static org.junit.Assert.*;

public class BlackJack_Test {
	
	@Test
	public void playTEST() {
		
		assertEquals(BlackJack.play(10, 21), 21);
		assertEquals(BlackJack.play(20, 18), 20);
		assertEquals(BlackJack.play(1, 22), 1);
		assertEquals(BlackJack.play(22, 1), 1);
		assertEquals(BlackJack.play(22, 23), 0);

	}

}
