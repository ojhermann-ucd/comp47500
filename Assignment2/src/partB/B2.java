package partB;


// IMPORTS
import java.util.Random;


public class B2 {
	
	// MAIN
	public static void main(String[] args) {
		
		System.out.println("B2: Average");
		System.out.println("");
		System.out.println("Here are five examples of Average(int a, int b)");
		System.out.println("");
		System.out.println("");
		
		// random number: rn
		Random rn = new Random();
		
		// five examples of Average
		for (int k=0; k < 5; k++) {
			// create two inputs
			int a = rn.nextInt(10) + 1;
			int b = rn.nextInt(10) + 1;
			// five examples of Average
			System.out.println("Example: " + String.valueOf(k + 1));
			System.out.println("--------------------------------------------------");
			Average(a, b);
		}
		
	}
	
	// AVERAGE
	public static double Average(int a, int b) {
		
		// inputs
		System.out.println("Input");
		String inputMessage1 = "int a = " + String.valueOf(a);
		String inputMessage2 = "int b = " + String.valueOf(b);
		System.out.println(inputMessage1);
		System.out.println(inputMessage2);
		System.out.println("");
		
		//averageOutput
		double averageOutput = ((double)a + (double)b) / 2.0;
		System.out.println("Algorithm");
		String outputMessage1 = "output = (a + b) / 2 = (" + String.valueOf(a) + " + " + String.valueOf(b) + ") / 2";
		System.out.println(outputMessage1);
		System.out.println("");
		
		
		// message to grader
		System.out.println("Summary");
		String outputMessage = "Average(" + String.valueOf(a) + ", " + String.valueOf(b) +") = ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(averageOutput));
		System.out.println("");
		System.out.println("");
		
		// return
		return averageOutput;
	}

}
