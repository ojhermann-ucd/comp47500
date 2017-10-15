package partB;

public class B1 {
	
	// MAIN
	public static void main(String[] args) {
		
		System.out.println("B1: Increment");
		System.out.println("");
		System.out.println("Here are five examples of Increment(int a)");
		System.out.println("");
		System.out.println("");
		
		// five examples of Increment
		for (int k = 1; k < 6; k++) {
			System.out.println("Example: " + String.valueOf(k));
			System.out.println("--------------------------------------------------");
			Increment(k);
		}
	}
	
	// INCREMENT
	public static int Increment(int a) {
		
		// inputs
		System.out.println("Input");
		String inputMessage1 = "int a = " + String.valueOf(a);
		System.out.println(inputMessage1);
		System.out.println("");
		
		// incrementOutput
		int incrementOutput = a + 1;
		System.out.println("Algorithm");
		String outputMessage1  = "output <-- a + 1 = " + String.valueOf(a) + " + 1 = " + String.valueOf(incrementOutput);
		System.out.println(outputMessage1);
		System.out.println("");
		
		// summary
		System.out.println("Summary");
		String summaryMessage = "Increment(" + String.valueOf(a) + ") = " + String.valueOf(incrementOutput);
		System.out.println(summaryMessage);
		System.out.println("");
		System.out.println("");
		
		// return value
		return incrementOutput;
	}
	

}
