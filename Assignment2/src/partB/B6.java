package partB;


//IMPORTS
import java.util.Arrays;
import java.util.Random;


public class B6 {
	
	// MAIN
	public static void main (String[] args) {
		int n = 5;
		int[] arrayA = new int[n];
		MinValueIndex(arrayA, n);
	}
	
	// MINVALUEINDEX
	public static int MinValueIndex(int[] arrayA, int n) {
		
		// random number rn
		Random rn = new Random();
		
		// arrayA
		for (int k = 0; k < n; k++) {
			arrayA[k] = rn.nextInt(10) + 1;
		}
		
		// minValueIndex
		int minValueIndex = 0;
		for (int k = 1; k < n; k++) {
			if (arrayA[minValueIndex] > arrayA[k]) {
				minValueIndex = k;
			}
		}
		
		// message to grader
		String outputMessage = "The output of MinValueIndex(" + Arrays.toString(arrayA) + ", " + String.valueOf(n) +") is ";
		System.out.print(outputMessage);
		System.out.println(String.valueOf(minValueIndex));
		
		
		// return
		return minValueIndex;
	}

}
