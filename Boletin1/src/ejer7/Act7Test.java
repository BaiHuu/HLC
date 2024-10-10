package ejer7;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class Act7Test {

	@ParameterizedTest
	@MethodSource("fechasOk")
	public void testFecha(int dia, int mes, int año, boolean resultadoEsperado) {
		boolean resultadoObtenido = Act7.fechaCorrecta(dia, mes, año);
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	private static Stream<Arguments> fechasOk () {
		return Stream.of(
				Arguments.of(2, 6, 2024, true),
				Arguments.of(7, 6, 2014, true),
				Arguments.of(39, 8, 2024, false)
				);
				
		 
	}
	
	
	
	/*
	@Test
	public void testFechaCorrecta() {
		boolean resultadoObtenido = Act7.fechaCorrecta(1, 1, 2024); // 1/1/2024
		assertEquals(true, resultadoObtenido);
	}


	@Test
	public void testFechaIncorrecta() {
		boolean resultadoObtenido = Act7.fechaCorrecta(32, 1, 2024); 
		assertEquals(false, resultadoObtenido);
	}
	*/
}
	