package com.simplilearn;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class G_DynamicTestDemo {

	Calculator c;

	@BeforeEach
	public void init() {
		c = new Calculator();
	}

	@TestFactory
	public Collection<DynamicTest> dynamicTests() {
		Collection<DynamicTest> tests = new ArrayList<DynamicTest>();

		// ADD your multiple tests
		tests.add(DynamicTest.dynamicTest("TEST 1- when both arg positive", () -> {
			Assertions.assertEquals(2, c.calculate(1, 1));
		}));
		
		tests.add(DynamicTest.dynamicTest("TEST 2- when both arg negative", () -> {
			Assertions.assertEquals(-2, c.calculate(-1, -1));
		}));
		
		tests.add(DynamicTest.dynamicTest("TEST 2- when one is positive and one is negative", () -> {
			Assertions.assertEquals(0, c.calculate(-1, 1));
		}));
		
		

		return tests;
	}
}
