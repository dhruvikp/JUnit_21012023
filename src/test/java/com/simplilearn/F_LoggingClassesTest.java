package com.simplilearn;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class F_LoggingClassesTest {

	@Test
	@DisplayName("Test..")
	public void test(TestInfo testInfo, TestReporter testReporter) {
		testReporter.publishEntry("--->", testInfo.getDisplayName());
	}
}
