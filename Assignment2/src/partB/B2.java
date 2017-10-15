package partB;


// IMPORTS
import java.util.Random;


public class B2 {
	
	// MAIN
	public static void main(String[] args) {
		
		System.out.println("B2: Average");
		System.out.println("");
		
		// random number: rn
		Random rn = new Random();
		
		// five examples of Average
		for (int k=0; k < 5; k++) {
			// create two inputs
			int a = rn.nextInt(10) + 1;
			int b = rn.nextInt(10) + 1;
			// five examples of Average
			Average(a, b);
		}
		
	}
	
	// AVERAGE
	public static double Average(int a, int b) {
		
		//averageOutput
		double averageOutput = ((double)a + (double)b) / 2.0;
		
		// message to grader
		String outputMessage = "The output of Average(" + String.valueOf(a) + ", " + String.valueOf(b) +") is ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(averageOutput));
		
		// return
		return averageOutput;
	}

}
