package ejer6;

public class Act6 {

	public static int calculadora(int num1, int num2, int opc) {
		int variable = 0;
		int res = 0;

		if (opc >= 1 && opc <=  4) {

			switch (opc) {
			case 1: {
				res = sumar(num1, num2);
				break;
			}
			case 2: {
				res = restar(num1, num2);
				break;
			}
			case 3: {
				res = multiplicar(num1, num2);
				break;
			}
			case 4: {
				res = dividir(num1, num2);
				break;
			}

			}

		}

		return res;
	}

	public static int sumar(int operando1, int operando2) {
		int resultado = 0;
		int resultadoSuma;
		resultadoSuma = operando1 + operando2;

		return resultadoSuma;

	}

	public static int restar(int operando1, int operando2) {
		int resultado = 0;
		int resultadoResta;
		resultadoResta = operando1 - operando2;

		return resultadoResta;

	}

	public static int multiplicar(int operando1, int operando2) {
		int resultado = 0;
		int resultadoMultiplicación;
		resultadoMultiplicación = operando1 * operando2;

		return resultadoMultiplicación;

	}

	public static int dividir(int operando1, int operando2) {
		int resultado = 0;
		int resultadoDividir;
		resultadoDividir = operando1 / operando2;

		return resultadoDividir;

	}
}
