package ejer3;

public class Act3 {

	public static String fizzbuzz(int num) {
		
		
		int input = num;
		String result = "" ;
	
		
		
		if (input % 3 == 0) {
			result = "fizz";
		} else if (input % 5 == 0)
			result = "buzz";
		
		if (input % 15 == 0) {
			result = "fizzbuzz";
		}
		
		return result;
	}
		
		
	
}
