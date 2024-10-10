package ejer6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class Act6Test {

	// SINCERIDAD ANTE TODO, HE BUSCADO EN INTERNET COMO HACER UN PARAMETIZED TEST DE VARIOS VALORES POR QUE...
	// SI NO TENDRÍA QUE REHACERLO TODO
	
	@ParameterizedTest
	@CsvSource ({
		"4, 2, 1, 6", // Suma: 4 + 2 = 6
		"4, 2, 2, 2", // Resta: 4 - 2 = 2
		"4, 2, 3, 8", // Multiplicación
		"4, 2, 4, 2"  // División: 4 / 2 = 2
	})
	
	void calculadoraTest(int num1, int num2, int opcion, int resultadoEsperado) {
		
		int resultadoObtenido = Act6.calculadora(num1, num2, opcion);
		assertEquals(resultadoEsperado, resultadoObtenido);
	
}
	
	/* @Test
	void CalculadoraSumaTest() {
		int resultadoObtenido = Act6.sumar(4, 2);
		
		assertEquals(6, resultadoObtenido);
	}
	
	@Test
	void CalculadoraRestaTest() {
		int resultadoObtenido = Act6.restar(4, 2);
		
		assertEquals(2, resultadoObtenido);
	}
	
	@Test
	void CalculadoraMultiplicacionTest() {
		int resultadoObtenido = Act6.multiplicar(4, 2);
		
		assertEquals(8, resultadoObtenido);
	}
	
	@Test
	void CalculadoraDividirTest() {
		int resultadoObtenido = Act6.dividir(8, 2);
		
		assertEquals(4, resultadoObtenido);
	}
	*/
	
}
