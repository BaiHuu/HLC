package ejer3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Act3Test {

	@Test
	void fizz() {
		String result = Act3.fizzbuzz(3);
		assertEquals("fizz", result);
	}
	@Test
	void buzz() {
		String result = Act3.fizzbuzz(5);
		assertEquals("buzz", result);
	}
	@Test
	void fizzbuzz() {
		String result = Act3.fizzbuzz(15);
		assertEquals("fizzbuzz", result);
	}
 
}
