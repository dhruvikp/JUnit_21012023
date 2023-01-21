package com.simplilearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class B_Assertions {

	@Test
	public void test() {
		int actual = 1;
		int expected = 1;

		Assertions.assertEquals(expected, actual);
		
		String str = null;
		Assertions.assertNull(str);
		
		//Integer[] a1 = {1,2};
		//Integer[] a2 = {1,2};
		
		 int[ ][ ] a1 = {{1,2},{2,1}} ;
		 int[ ][ ] a2 = {{1,2},{2,1}}; 
		
		Assertions.assertArrayEquals(a1, a2);
	}
}
