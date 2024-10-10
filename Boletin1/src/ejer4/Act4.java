package ejer4;

public class Act4 {

	public static boolean esPrimo(int num) {
		
		boolean result = true;
		
		
	for (int i = 2; i < num; i++) {
		
		if (num % i == 0) {
			result = false;
			}
			 
		
		} 
		
		
		return result;
	} 
}
