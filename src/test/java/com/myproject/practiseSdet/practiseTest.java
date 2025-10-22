package com.myproject.practiseSdet;

import junit.framework.TestCase;


public class practiseTest extends TestCase  {
	
	public void testMultiply() {
		practiseClass pClass = new practiseClass();
		
		assertEquals(9, pClass.multiply(1, 8));
		
	}
	

}
