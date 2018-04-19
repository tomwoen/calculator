package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class DividerTest {

	
	Divider divider;
	
	@Test
	public void test() {

		divider = new Divider();
		int expectedValue = 3;
		int actualValue = Divider.divide(9,3);
		Assert.assertEquals(expectedValue, actualValue);
		
	}


}
