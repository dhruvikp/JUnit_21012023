package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class E_RepeatedDemo {

	
	Calculator c;
	
	@BeforeEach
	public void init() {
		c = new Calculator();
	}
	
	@Test
	@RepeatedTest(1000)
	public void testAddNumber() {
		Assertions.assertEquals(2, c.calculate(1, 1));
	}

}
