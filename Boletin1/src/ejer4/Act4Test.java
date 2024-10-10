package ejer4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Act4Test {

	@Test
	void noPrimos() {
		boolean result = Act4.esPrimo(10);
		assertFalse(result);
	}
	
	
	@Test
	void siPrimos() {
		boolean result = Act4.esPrimo(3);
		assertTrue(result);
	}
} 
