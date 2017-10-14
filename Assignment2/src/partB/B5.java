package partB;


import java.util.Arrays;
//IMPORTS
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
		int minValue = arrayA[0];
		for (int k = 0; k < n; k++) {
			if (minValue > arrayA[k]) {
				minValue = arrayA[k];
			}
		}
		
		// message to grader
		String outputMessage = "The output of MinValue(" + Arrays.toString(arrayA) + ", " + String.valueOf(n) +") is ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(minValue));
		
		
		// return
		return minValue;
	}

}
