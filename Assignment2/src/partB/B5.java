package partB;


//IMPORTS
import java.util.Arrays;
import java.util.Random;


public class B5 {
	
	// MAIN
	public static void main (String[] args) {
		int n = 5;
		int[] arrayA = new int[n];
		MinValue(arrayA, n);
		
	}
	
	// MINVALUE
	public static int MinValue(int[] arrayA, int n) {
		
		// random number rn
		Random rn = new Random();
		
		// arrayA
		for (int k = 0; k < n; k++) {
			arrayA[k] = rn.nextInt(10) + 1;
		}
		
		// minValue

		System.out.println("INPUTS");
		System.out.println("arrayA is " + Arrays.toString(arrayA));
		System.out.println("n is " + String.valueOf(n));
		System.out.println("");
		
		int minValue = arrayA[0];

		System.out.println("ALGORITHM");
		System.out.println("minValue = arrayA[0] = " + String.valueOf(arrayA[0]));

		for (int k = 1; k < n; k++) {
			if (minValue > arrayA[k]) {
				String bigMessage = "minValue = " + String.valueOf(minValue) + " > "+ String.valueOf(arrayA[k]) + " = array[" + String.valueOf(k) + "], so minValue <-- " + String.valueOf(arrayA[k]);
				System.out.println(bigMessage);
				minValue = arrayA[k];
			} else {
				String smallMessage = "minValue = " + String.valueOf(minValue) + " < " + String.valueOf(arrayA[k]) + " = array[" + String.valueOf(k) + "]" ;
				System.out.println(smallMessage);
			}
			
		}
		
		// message to grader
		System.out.println("");
		System.out.println("SUMMARY");
		String outputMessage = "MinValue(" + Arrays.toString(arrayA) + ", " + String.valueOf(n) +") = ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(minValue));
		
		
		// return
		return minValue;
	}

}
