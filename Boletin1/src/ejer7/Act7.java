package ejer7;

public class Act7 {

	public static boolean fechaCorrecta (int dia, int mes, int año) {
		
		boolean resultadoObtenido = true;
		int diasMes;
		
		
		if (mes < 1 || mes > 12) {
			resultadoObtenido = false;
		}
		
		
		switch (mes) {
		case 4: case 6: case 9: case 11:
			diasMes = 30;
			break;
		case 2: 
			diasMes = 28; 
			break;
		default: 
			diasMes = 31;
			
		}
		
		if (dia < 1 || dia > diasMes) {
			resultadoObtenido = false;
		}
		
		if (año > 2024 && año > 1999) {
			resultadoObtenido = false;
		}
		
		
		 
		
		return resultadoObtenido;
	}
	
}
