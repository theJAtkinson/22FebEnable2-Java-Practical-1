package com.qa.test;

import org.junit.*;
import com.qa.main.taxes.*;
import static org.junit.Assert.*;

public class Taxes_Test {
	
	
	@Test
	public void setTaxPercent_TEST() {
		Taxes band1 = new Taxes(14999);
		Taxes band2 = new Taxes(19999);
		Taxes band3 = new Taxes(29999);
		Taxes band4 = new Taxes(44999);
		Taxes band5 = new Taxes(45000);
		
		band1.setTaxPercent();
		assertEquals(band1.getTaxPercent(),0);
		
		band2.setTaxPercent();
		assertEquals(band2.getTaxPercent(),10);
		
		band3.setTaxPercent();
		assertEquals(band3.getTaxPercent(),15);
		
		band4.setTaxPercent();
		assertEquals(band4.getTaxPercent(),20);
		
		band5.setTaxPercent();
		assertEquals(band5.getTaxPercent(),25);
	}
	
	@Test
	public void getTaxAmount_TEST() {
		Taxes band1 = new Taxes(12000);
		Taxes band2 = new Taxes(16000);
		Taxes band3 = new Taxes(24000);
		Taxes band4 = new Taxes(32000);
		Taxes band5 = new Taxes(64000);
		
		band1.setTaxPercent();
		band2.setTaxPercent();
		band3.setTaxPercent();
		band4.setTaxPercent();
		band5.setTaxPercent();
		
		assertEquals(band1.getTaxAmount(),0, 1);
		assertEquals(band2.getTaxAmount(),1600, 1);
		assertEquals(band3.getTaxAmount(),3600, 1);
		assertEquals(band4.getTaxAmount(),6400, 1);
		assertEquals(band5.getTaxAmount(),16000, 1);
		
	}
}
