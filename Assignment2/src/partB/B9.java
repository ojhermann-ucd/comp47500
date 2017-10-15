package partB;


//IMPORTS
import java.util.Random;


public class B9 {
	
	// MAIN
	public static void main (String[] args) {
		
		System.out.println("B9: Power");
		System.out.println("");
		
		// random number rn
		Random rn = new Random();
		
		// five examples of Power
		for (int k = 0; k < 5; k++) {
			// create inputs
			int a = rn.nextInt(10) + 1;
			int b = rn.nextInt(10) + 1;
			// give examples of Power
			Power(a, b);
		}
	}
	
	// POWER
	public static long Power(long a, long b) {
		
		// power
		long power = 1;
		for (int k = 1; k < b + 1; k++) {
			power *= a;
		}
		
		// message to grader
		String outputMessage = "The output of Power(" + String.valueOf(a) + ", " + String.valueOf(b) +") is ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(power));
		
		// return
		return power;
	}


}
