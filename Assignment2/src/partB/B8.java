package partB;


//IMPORTS
import java.util.Random;


public class B8 {
	
	// MAIN
	public static void main (String[] args) {
		
		System.out.println("B8: Factorial");
		System.out.println("");
		System.out.println("Here are five examples of Factorial(int a) with random a");
		System.out.println("");
		System.out.println("");
		
		// random number rn
		Random rn = new Random();
		
		// five examples of Factorial
		for (int k = 0; k < 5; k++) {
			System.out.println("Example: " + String.valueOf(k + 1));
			System.out.println("--------------------------------------------------");
			// create inputs
			int a = rn.nextInt(10) + 1;
			// give examples of Factorial
			Factorial(a);
		}
	}
	
	// FACTORIAL
	public static int Factorial(int a) {
		
		// input
		System.out.println("Input");
		String inputMessage1 = String.format("int a = %2d", a);
		System.out.println(inputMessage1);
		System.out.println("");
		
		// factorical
		int factorial = 1;
		for (int k = 1; k < a + 1; k++) {
			factorial *= k;
		}
		System.out.println("Algorithm");
		factorial = 1;
		System.out.println("factorial <-- 1");
		for (int k = 1; k < a + 1; k++) {
			System.out.println(String.format("factorial <-- factorial * k = %d * %d = %d", factorial, k, factorial * k));
			factorial *= k;
		}
		System.out.println("");
		
		// message to grader
		System.out.println("Summary");
		String outputMessage = "Factorial(" + String.valueOf(a) +") = ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(factorial));
		System.out.println("");
		System.out.println("");
		
		// return
		return factorial;
	}

}
