package partB;


//IMPORTS
import java.util.Random;


public class B3 {
	
	// MAIN
	public static void main (String[] args) {
		
		System.out.println("B3: MaxInt");
		System.out.println("");
		
		// random number: rn
		Random rn = new Random();
		
		// five examples of MaxInt
		for (int k = 0; k < 5; k++) {
			// create inputs
			int a = rn.nextInt(10) + 1;
			int b = rn.nextInt(10) + 1;
			// give examples of MaxInt
			MaxInt(a, b);
		}
	}
	
	// MAXINT
	public static int MaxInt(int a, int b) {
		
		// maxIntOutput
		int maxIntOutput;
		if (a > b) {
			maxIntOutput = a;
		} else {
			maxIntOutput = b;
		}
		
		// message to grader
		String outputMessage = "The output of MaxInt(" + String.valueOf(a) + ", " + String.valueOf(b) +") is ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(maxIntOutput));
		
		// return
		return maxIntOutput;
	}

}
