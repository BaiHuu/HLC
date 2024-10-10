package ejer9;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Act9Test {

	@ParameterizedTest
	@CsvSource({ //CSV mirado tambien en documentaciones. (solo se me ocurría una test)
	"1, 1",
	"2, 10",
	"3, 11",
	"4, 100",
	"10, 1010"
	})
	public void testBinario(int numero, String stringEsperado) {
		String resulObtenido = Act9.binarios(numero);
		assertEquals(stringEsperado ,resulObtenido);
	}
	

	
	@Test
	public void testNBinario () {
		String resulObtenido = Act9.binarios(28);
		assertEquals("11100", resulObtenido);
	}
}
