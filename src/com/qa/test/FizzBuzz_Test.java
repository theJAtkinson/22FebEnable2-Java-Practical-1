package com.qa.test;

import org.junit.Test;
import com.qa.main.fizzbuzz.*;
import static org.junit.Assert.*;

public class FizzBuzz_Test {
	
	@Test
	public void fizzBuzz_TEST() {
		assertEquals(FizzBuzz.fizzBuzz(1),"1");
		assertEquals(FizzBuzz.fizzBuzz(2),"2");
		assertEquals(FizzBuzz.fizzBuzz(3),"Fizz");
		assertEquals(FizzBuzz.fizzBuzz(4),"4");
		assertEquals(FizzBuzz.fizzBuzz(5),"Buzz");
		assertEquals(FizzBuzz.fizzBuzz(6),"Fizz");
		assertEquals(FizzBuzz.fizzBuzz(7),"7");
		assertEquals(FizzBuzz.fizzBuzz(8),"8");
		assertEquals(FizzBuzz.fizzBuzz(9),"Fizz");
		assertEquals(FizzBuzz.fizzBuzz(15),"FizzBuzz");
	}
}
