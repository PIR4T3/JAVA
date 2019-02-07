package com.pirate.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestSuite {

	@Test
	void test() {
		Addition addition = new Addition();
		String []str = addition.input();
		for(String s: str) {
			System.out.println(s);
		}
		int sum = Integer.parseInt(str[0]);
		int num1 = Integer.parseInt(str[1]);
		int num2 = Integer.parseInt(str[2]);
		assertEquals(sum, addition.addition(num1, num2));
	}

}
