package com.qa.test;

import org.junit.Test;
import com.qa.main.helloworld.*;
import static org.junit.Assert.*;

public class HelloWorld_Test {
	
	@Test
	public void returnMsg_TEST() {
		
		assertEquals("Hello World!", HelloWorld.returnMsg());
		assertEquals("Test Worked!", HelloWorld.returnMsg("Test Worked!"));
	}
}
