package partB;


//IMPORTS
import java.util.Random;


public class B9 {
	
	// MAIN
	public static void main (String[] args) {
		
		System.out.println("B9: Power");
		System.out.println("");
		System.out.println("Here are five examples of Power(int a, int b) with random a, random b");
		System.out.println("");
		System.out.println("");
		
		// random number rn
		Random rn = new Random();
		
		// five examples of Power
		for (int k = 0; k < 5; k++) {
			System.out.println("Example: " + String.valueOf(k + 1));
			System.out.println("--------------------------------------------------");
			// create inputs
			int a = rn.nextInt(10) + 1;
			int b = rn.nextInt(10) + 1;
			// give examples of Power
			Power(a, b);
		}
	}
	
	// POWER
	public static long Power(long a, long b) {
		
		// input
		System.out.println("Input");
		String inputMessage1 = String.format("int a = %2d", a);
		String inputMessage2 = String.format("int b = %2d", b);
		System.out.println(inputMessage1);
		System.out.println(inputMessage2);
		System.out.println("");
		
		// power
		long power = 1;
		for (int k = 1; k < b + 1; k++) {
			power *= a;
		}
		System.out.println("Algorithm");
		power = 1;
		System.out.println("power <-- 1");
		for (int k = 1; k < b + 1; k++) {
			System.out.println(String.format("power <-- power * a = %d * %d = %d", power, a, power * a));
			power *= a;
		}
		System.out.println("");
		
		// message to grader
		System.out.println("Summary");
		String outputMessage = "Power(" + String.valueOf(a) + ", " + String.valueOf(b) +") = ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(power));
		System.out.println("");
		System.out.println("");
		
		// return
		return power;
	}


}
