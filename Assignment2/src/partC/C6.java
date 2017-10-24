package partC;

//IMPORTS
import java.util.Arrays;
import java.util.Random;

public class C6 {
	
	// MAIN
	public static void main (String[] args) {
		// nValues
		int[] nValues = {100000, 200000, 500000, 1000000, 2000000};
		
		// run tests
		for (int n: nValues) {
			double averageTime = 0;
			for (int j = 0; j < 5; j++) {
				int[] arrayA = new int[n];
				double outPut = MinValueIndexTest(arrayA, n);
				averageTime += outPut;
				System.out.println(String.format("n = %d, iteration %d, run time = %f", n, j, outPut));
			}
			averageTime /= 5;
			System.out.println(String.format("Average run time for n = %d: %f", n, averageTime));
			System.out.println("");
		}
	}
	
	// MINVALUEINDEXTEST
	public static double MinValueIndexTest(int[] arrayA, int n) {

		// random number rn
		Random rn = new Random();

		// arrayA
		for (int k = 0; k < n; k++) {
			arrayA[k] = rn.nextInt(10) + 1;
		}

		// minValueIndex
		double start = System.currentTimeMillis();
		int minValueIndex = 0;
		for (int k = 1; k < n; k++) {
			if (arrayA[minValueIndex] > arrayA[k]) {
				minValueIndex = k;
			}
		}
		double end = System.currentTimeMillis();

		// return
		return end - start;
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

		// return
		return minValueIndex;
	}

}