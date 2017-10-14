package partB;

public class B1 {
	
	// MAIN
	public static void main(String[] args) {
		// five examples of Increment
		for (int k = 1; k < 6; k++) {
			Increment(k);
		}
	}
	
	// INCREMENT
	public static int Increment(int a) {
		
		// incrementOutput
		int incrementOutput = a + 1;
		
		// message to grader
		String outputMessage = "The output of Increment(" + String.valueOf(a) + ") is ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(incrementOutput));
		
		// return value
		return incrementOutput;
	}
	

}
