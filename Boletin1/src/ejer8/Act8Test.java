package ejer8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Act8Test {

	@ParameterizedTest
	@CsvSource({
		"1, 0",
		"2, 1",
		"3, 1",
		"4, 2",
		"5, 3",
		"6, 5",
		"7, 8",
		"8, 13",
		
	})
	public void testFiboMultiNum(int num, int resultadoEsperado) {
		int resultadoObtenido = Act8.fibonacci(num);
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	/*
	@Test
	void testFibo() {
		int resulObtenido = Act8.fibonacci(1);
		assertEquals(0, resulObtenido);
	}
	@Test
	void testFibo2() {
		int resulObtenido = Act8.fibonacci(2);
		assertEquals(1, resulObtenido);
	}
	*/
}
