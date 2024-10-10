package ejer2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class Act2Test {
	

	@Test
	void testEsPar2() {
		boolean res = Act2.esPar('2');
		assertTrue(res);
	}
	@Test
	void testEs0() {
		boolean res = Act2.esPar('0');
		assertTrue(res);
	}
	
	
	
}
