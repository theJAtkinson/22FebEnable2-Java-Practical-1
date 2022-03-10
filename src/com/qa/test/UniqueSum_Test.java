package com.qa.test;

import org.junit.Test;
import com.qa.main.uniquesum.*;
import static org.junit.Assert.*;

public class UniqueSum_Test {
	
	@Test
	public void uniqueSumTEST() {
		assertEquals(UniqueSum.uniqueSum(1, 2, 3), 6);
		assertEquals(UniqueSum.uniqueSum(1, 1, 1), 0);
		assertEquals(UniqueSum.uniqueSum(1, 1, 10), 10);
		assertEquals(UniqueSum.uniqueSum(1, 9, 1), 9);
		assertEquals(UniqueSum.uniqueSum(8, 1, 1), 8);
	}
}
