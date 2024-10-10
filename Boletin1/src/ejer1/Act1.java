package ejer1;

public class Act1 {
	
		public static boolean esVocal(char caracter) {
			
			char caracterMinus = Character.toLowerCase(caracter);
			boolean resul = false;
			
			switch (caracterMinus) {
			case 'a', 'e', 'i', 'o', 'u':
				resul = true;
			}
			
			return resul;
		
		}
	
	
}
