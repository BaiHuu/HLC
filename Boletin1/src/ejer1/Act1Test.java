package ejer1;

import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act1Test {

	@ParameterizedTest
	@MethodSource("pruebasVocales")
	void testEsVocal(char caracter, boolean resEsperado) {
		boolean resulObtenido = Act1.esVocal(caracter);
		assertEquals(resEsperado, resulObtenido);
	}
	
	private static Stream<Arguments> pruebasVocales(){
		return Stream.of(Arguments.of('a', true),
				Arguments.of('A', true),
				Arguments.of('e', true),
				Arguments.of('b', false));
	}
	
	/*
	@Test
	void testEsVocalAMinus() {
		boolean resul = Act1.esVocal('a');
		assertEquals(true, resul);
	}
	
	@Test
	void testEsVocalEMinus() {
		boolean resul = Act1.esVocal('e');
		assertEquals(true, resul);
	}
	
	@Test
	void testEsVocalAMayus() {
		boolean resul = Act1.esVocal('A');
		assertEquals(true, resul);
	}*/
}
