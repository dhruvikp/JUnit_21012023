package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class CalculatorTest {

	Calculator c;

	@BeforeEach
	public void init() {
		c = new Calculator();
	}

	@Test
	public void test_calculator_when_both_argument_positive() {
		// STEP 1: Prepare input
		int a = 1;
		int b = 1;
		
		// Step 2: Gets actual value
		int actual = c.calculate(a, b);
		
		// STEP 3: Expect value
		int expected = 2;
		
		// Step 4: Assert values
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void test_calculator_when_both_argument_negative() {
		// STEP 1: Prepare input
		int a = -1;
		int b = -1;
		
		// Step 2: Gets actual value
		int actual = c.calculate(a, b);
		
		// STEP 3: Expect value
		int expected = -2;
		
		// Step 4: Assert values
		Assertions.assertEquals(expected, actual);
	}
}
