package ejer10;

public class Act10 {

	public static boolean esPalindromo (String palabra) {
		
		boolean resultadoObtenido = false;
		
		
		String palabraPalindroma = String.valueOf(palabra);
		String palabraInversa = "";
		
		for ( int i = 0; i < palabraPalindroma.length(); i++) {
			palabraInversa = palabraPalindroma.charAt(i) + palabraInversa;
			
			
		}
		
		if (palabraInversa.trim().equals(palabraPalindroma.trim())) {
			resultadoObtenido = true;
		}
		
		
		return resultadoObtenido;
	}
	
}
