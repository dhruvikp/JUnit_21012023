package com.simplilearn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;

import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@DisplayName("this is sample parent class")
public class D_NestedTest {

	@Nested
	@DisplayName("this is sample nested class")
	class A {
		
		@Test
		@DisplayName("this is sample nested class test")
		public void test() {
			System.out.println("This is test method..");
		}
	}
}