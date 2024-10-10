package ejer9;

public class Act9 {

	public static String binarios (int numero) { // BUSCADO EN DOCUMENTACIÓN, no iba a sacarlo solo ni queriendo.
		
		String numeroBinario = "";
		
		while (numero > 0) {
			if (numero % 2 == 0) {
				numeroBinario = "0" + numeroBinario;
			} else {
				numeroBinario = "1" + numeroBinario;
			}
			
			numero = numero / 2;
			
			
		}
		
		
		return numeroBinario;
		
	}
}
