package com.simplilearn;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class A_Lifecycle {

	@BeforeAll
	public static void initAll() {
		System.out.println("Before All gets executed");
	}

	@BeforeEach
	public void initEach() {
		System.out.println("Before each is invoked");
	}

	@Test
	public void test1() {
		System.out.println("Test case 1");
	}

	@Test
	public void test2() {
		System.out.println("Test case 2");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("After each is invoked");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("After All gets executed");
	}
}
