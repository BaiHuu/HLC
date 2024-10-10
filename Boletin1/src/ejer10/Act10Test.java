package ejer10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Act10Test {

	@Test
	void testPalindromo() {
		boolean resultadoObtenido = Act10.esPalindromo("somos");
		assertTrue(resultadoObtenido);
	}
	@Test
	void testNoPalindromo() {
		boolean resultadoObtenido = Act10.esPalindromo("HOLA");
		assertFalse(resultadoObtenido);
	}

}
