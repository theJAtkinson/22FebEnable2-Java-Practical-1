package com.qa.test;

import org.junit.Test;
import org.junit.Before;
import com.qa.main.stringmanipulation.*;
import static org.junit.Assert.*;

public class StringManipulation_Test {
	
	private StringManipulation test;
	
	@Before
	public void setUp() {
		test = new StringManipulation();
	}
	
	@Test
	public void taskOneITEST() {
		assertEquals(test.taskOneI(),"TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING");
	}
	
	@Test
	public void taskOneIITEST() {
		assertEquals(test.taskOneII(),"TODAY IT IS RAINING");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void methodOneTESTScope1() throws IllegalArgumentException {
		test.methodOne(" Fail");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void methodOneTESTScope2() throws IllegalArgumentException {
		test.methodOne("Fail ");
	}
	
	@Test
	public void methodOneTEST() {
		assertEquals(test.methodOne("One"),1);
		assertEquals(test.methodOne("Two two"),2);
		assertEquals(test.methodOne("today it is sunny"),4);
	}
	
	@Test
	public void methodFourTEST() {
		assertEquals(test.methodFour("This one is true", "true"), true);
		assertEquals(test.methodFour("This one is false", "true"), false);
		assertEquals(test.methodFour("This one is true", " one"), true);
		assertEquals(test.methodFour("This one is true", "one "), true);
		assertEquals(test.methodFour("This one is true", " one "), true);
		assertEquals(test.methodFour("This one is true", "This"), true);
		assertEquals(test.methodFour("This one is false", " This"), false);
		assertEquals(test.methodFour("This one is false", "false "), false);
	}
}
