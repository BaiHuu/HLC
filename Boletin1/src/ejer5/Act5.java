package ejer5;

public class Act5{
	
	public static boolean capicua(int num1) {
		
		String cadenaCapi = String.valueOf(num1);
		String cadenaInv = "";
		boolean result = false;
		
		for (int i = 0; i < cadenaCapi.length(); i++) {
			
			cadenaInv = cadenaCapi.charAt(i) + cadenaInv;
			int stringCadenaInv = Integer.parseInt(cadenaInv);
			
			if (stringCadenaInv == num1) {
				result = true;
			}
		}
		
		
		
		
		
		
		return result;
		

	}


}
