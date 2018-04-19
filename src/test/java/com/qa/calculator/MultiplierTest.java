package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MultiplierTest {
	
	private Multiplier multiplier;

	@Test
	public void test() {
		
		multiplier = new Multiplier();
		int expectedValue = 8;
		int actualValue = multiplier.multiply(4,2);
		Assert.assertEquals(expectedValue, actualValue);
	}


}
