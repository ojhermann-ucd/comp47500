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
		
		System.out.println("B6: MinValueIndex");
		System.out.println("");
		
		System.out.println("Note to Grader");
		System.out.println("I kept int n as an input so that you could modify the size of the arrays");
		System.out.println("All arrays are populated with random numbers between 1 and 10, inclusive");
		System.out.println("");
		
		// random number rn
		Random rn = new Random();
		
		// arrayA
		for (int k = 0; k < n; k++) {
			arrayA[k] = rn.nextInt(10) + 1;
		}
		
		System.out.println("INPUTS");
		System.out.println("arrayA is " + Arrays.toString(arrayA));
		System.out.println("n is " + String.valueOf(n));
		
		// minValueIndex
		System.out.println("");
		System.out.println("ALGORITHM");
		
		int minValueIndex = 0;
		System.out.println("minValueIndex <-- 0");
		for (int k = 1; k < n; k++) {
			if (arrayA[minValueIndex] > arrayA[k]) {
				System.out.println(String.format("arrayA[minValueIndex] = %d > %d = arrayA[%d]", arrayA[minValueIndex], arrayA[k], k));
				System.out.println(String.format("  minValueIndex <-- k = %d", k));
				minValueIndex = k;
			} else {
				System.out.println(String.format("arrayA[minValueIndex] = %d \u226F %d = arrayA[%d]", arrayA[minValueIndex], arrayA[k], k));
			}
		}
		System.out.println("");
		System.out.println(String.format("return minValueIndex = %d", minValueIndex));
		
		// message to grader
		String outputMessage = "MinValueIndex(" + Arrays.toString(arrayA) + ", " + String.valueOf(n) +") = ";
		System.out.println("");
		System.out.println("SUMMARY");
		System.out.print(outputMessage);
		System.out.println(String.valueOf(minValueIndex));
		
		
		// return
		return minValueIndex;
	}

}
