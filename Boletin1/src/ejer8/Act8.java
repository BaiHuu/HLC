package ejer8;

public class Act8 {

	public static int fibonacci (int num) { // MUCHA AYUDA DE INTERNET
		
		if (num < 1) {
			System.err.println("El número no puede ser menor que 1");
		}
		
		if (num == 1) {
			return 0;
		}else if (num == 2) {
			return 1;
			
		}
		
		int fibonacciViejo = 0;
		int fibonacciAhora = 1;
		int fibonacciNuevo;
		
		
		for (int i = 3; i <= num; i++) {
			fibonacciNuevo = fibonacciViejo + fibonacciAhora;
			fibonacciViejo = fibonacciAhora;
			fibonacciAhora = fibonacciNuevo;
	
		}
		
		return fibonacciAhora;
		
	}
	
}
