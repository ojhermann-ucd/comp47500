package partB;


//IMPORTS
import java.util.Random;


public class B8 {
	
	// MAIN
	public static void main (String[] args) {
		
		// random number rn
		Random rn = new Random();
		
		// five examples of Factorial
		for (int k = 0; k < 5; k++) {
			// create inputs
			int a = rn.nextInt(10) + 1;
			// give examples of Factorial
			Factorial(a);
		}
	}
	
	// FACTORIAL
	public static int Factorial(int a) {
		
		// factorical
		int factorial = 1;
		for (int k = 1; k < a + 1; k++) {
			factorial *= k;
		}
		
		// message to grader
		String outputMessage = "The output of Factorial(" + String.valueOf(a) +") is ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(factorial));
		
		// return
		return factorial;
	}

}
