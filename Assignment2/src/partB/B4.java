package partB;


// IMPORTS
import java.util.Random;


public class B4 {
	
	// MAIN
	public static void main (String[] args) {
		
		System.out.println("B4: Difference");
		System.out.println("");
		System.out.println("Here are five examples of Difference(int a, int b) with random a and b");
		System.out.println("");
		System.out.println("");
		
		// random number rn
		Random rn = new Random();
		
		// five examples of Difference
		for (int k = 0; k < 5; k++) {
			System.out.println("Example: " + String.valueOf(k + 1));
			System.out.println("--------------------------------------------------");
			// create inputs
			int a = rn.nextInt(10) + 1;
			int b = rn.nextInt(10) + 1;
			// give examples of Difference
			Difference(a, b);
		}
	}
	
	// DIFFERENCE
	public static int Difference (int a, int b) {
		
		// inputs
		System.out.println("Input");
		System.out.println(String.format("int a = %2d", a));
		System.out.println(String.format("int b = %2d", b));
		System.out.println("");
		
		// differenceOutput
		int differenceOutput;
		if (a > b) {
			differenceOutput = a - b;
		} else {
			differenceOutput = b - a;
		}
		System.out.println("Algorithm");
		if (a > b) {
			System.out.println(String.format("a = %d > %d = b", a, b));
			System.out.println(String.format("  return %d - %d = %d", a, b, differenceOutput));
		} else {
			System.out.println(String.format("a = %d \u226F %d = b", a, b));
			System.out.println(String.format("  return %d - %d = %d", b, a, differenceOutput));
		} 
		System.out.println("");
		
		// message to grader
		System.out.println("Summary");
		String outputMessage = "Difference(" + String.valueOf(a) + ", " + String.valueOf(b) +") = ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(differenceOutput));
		System.out.println("");
		System.out.println("");
		
		// return
		return differenceOutput;
		
	}

}
