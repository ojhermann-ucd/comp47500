package partB;

import java.util.Random;

public class B4 {
	
	// MAIN
	public static void main (String[] args) {
		
		// random number rn
		Random rn = new Random();
		
		// five examples of Difference
		for (int k = 0; k < 5; k++) {
			// create inputs
			int a = rn.nextInt(10) + 1;
			int b = rn.nextInt(10) + 1;
			// give examples of Difference
			Difference(a, b);
		}
	}
	
	// DIFFERENCE
	public static int Difference (int a, int b) {
		
		// differenceOutput
		int differenceOutput;
		if (a > b) {
			differenceOutput = a - b;
		} else {
			differenceOutput = b - a;
		}
		
		// message to grader
		String outputMessage = "The output of Difference(" + String.valueOf(a) + ", " + String.valueOf(b) +") is ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(differenceOutput));
		
		// return
		return differenceOutput;
		
	}

}
