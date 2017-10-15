package partB;


//IMPORTS
import java.util.Arrays;
import java.util.Random;


public class B7 {
	
	// MAIN
	public static void main (String[] args) {
		int n = 5;
		int[] arrayA = new int[n];
		PrefixAverages(arrayA, n);
	}
	
	// PREFIXAVERAGES
	public static int[] PrefixAverages(int[] arrayA, int n) {
		
		// random number rn
		Random rn = new Random();
		
		// arrayA
		for (int k = 0; k < n; k++) {
			arrayA[k] = rn.nextInt(10) + 1;
		}
		
		//arrayX
		int[] arrayX = new int[n];
		int runningSum = 0;
		for (int k = 0; k < n; k++) {
			runningSum += arrayA[k];
			arrayX[k] = runningSum;
		}
		
		// message to grader
		String outputMessage = "The output of PrefixAverage(" + Arrays.toString(arrayA) + ", " + String.valueOf(n) +") is ";
		System.out.print(outputMessage);
		System.out.println(Arrays.toString(arrayX));
		// return
		return arrayX;
		
	}

}
