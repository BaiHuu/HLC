package ejer5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act5Test {
	
	
	@ParameterizedTest
	@MethodSource("pruebaCapicua")
	void esCapicuaTest(int num1, boolean resultadoObtenido) {
		boolean resulObtenido = Act5.capicua(num1);
		assertEquals("True",resulObtenido);
	}
	
	private static Stream<Arguments> pruebaCapicua() {
		return Stream.of(
		Arguments.of(11, true),
		Arguments.of(111, true),
		Arguments.of(1221, true),
		Arguments.of(1211, false));
	}

	/*
	@Test
	 
	void esCapicuaTest() {
		boolean resulObtenido = Act5.capicua(11);
				assertTrue(resulObtenido);
	}
	
	@Test
	void esCapicua3Cifras() {
		boolean resulObtenido = Act5.capicua(111);
				assertTrue(resulObtenido);
	}
	@Test 
	void esCapicua4Cifras() {
		boolean resulObtenido = Act5.capicua(1221);
		assertTrue (resulObtenido);
	}
	@Test 
	void noCapicua() {
		boolean resulObtenido = Act5.capicua(1211);
		assertFalse(resulObtenido);
	}
	*/
	
}
