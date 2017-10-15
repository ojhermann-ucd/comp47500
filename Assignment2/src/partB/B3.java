package partB;


//IMPORTS
import java.util.Random;


public class B3 {
	
	// MAIN
	public static void main (String[] args) {
		
		System.out.println("B3: MaxInt");
		System.out.println("");
		System.out.println("Here are five examples of Average(int a, int b) with random a and b");
		System.out.println("");
		System.out.println("");
		
		// random number: rn
		Random rn = new Random();
		
		// five examples of MaxInt
		for (int k = 0; k < 5; k++) {
			System.out.println("Example: " + String.valueOf(k + 1));
			System.out.println("--------------------------------------------------");
			// create inputs
			int a = rn.nextInt(10) + 1;
			int b = rn.nextInt(10) + 1;
			// give examples of MaxInt
			MaxInt(a, b);
		}
	}
	
	// MAXINT
	public static int MaxInt(int a, int b) {
		
		// inputs
		System.out.println("Input");
		String inputMessage1 = String.format("int a = %2d", a);
		String inputMessage2 = String.format("int b = %2d", b);
		System.out.println(inputMessage1);
		System.out.println(inputMessage2);
		System.out.println("");
		
		// maxIntOutput
		int maxIntOutput;
		if (a > b) {
			maxIntOutput = a;
		} else {
			maxIntOutput = b;
		}
		System.out.println("Algorithm");
		if (a > b) {
			String algoMessage1 = String.format("%d > %d, so MaxInt(%d, %d) returns %d", a, b, a, b, a);
			System.out.println(algoMessage1);
		} else if (a == b) {
			String algoMessage3 = String.format("%d = %d, so MaxInt(%d, %d) returns %d", a, b, a, b, b);
			System.out.println(algoMessage3);
		} else {
			String algoMessage2 = String.format("%d < %d, so MaxInt(%d, %d) returns %d", a, b, a, b, b);
			System.out.println(algoMessage2);
		}
		System.out.println("");
		
		// message to grader
		System.out.println("Summary");
		String outputMessage = "MaxInt(" + String.valueOf(a) + ", " + String.valueOf(b) +") = ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(maxIntOutput));
		System.out.println("");
		System.out.println("");
		
		// return
		return maxIntOutput;
	}

}
