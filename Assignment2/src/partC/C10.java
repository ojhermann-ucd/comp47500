package partC;

//IMPORTS
import java.util.Arrays;
import java.util.Random;

public class C10 {

	// MAIN
	public static void main(String[] args) {
		// random number rn
		Random rn = new Random();
		// nValues
		int[] nValues = { 100000, 200000, 500000, 1000000, 2000000 };
		// iterValue
		int iterValue = 300;

		// run tests
		for (int n : nValues) {
			double averageTime = 0;
			for (int j = 0; j < iterValue; j++) {
				int[] arrayA = new int[n];
				int q = rn.nextInt(10) + 1;
				double outPut = LinearSearchTest(arrayA, n, q);
				averageTime += outPut;
			}
			averageTime /= iterValue;
			System.out.println(String.format("Average run time for n = %d: %f", n, averageTime));
			System.out.println("");
		}
	}

	// LINEARSEARCHTEST
	public static double LinearSearchTest(int[] arrayA, int n, int q) {
		// random number rn
		Random rn = new Random();

		// arrayA
		for (int k = 0; k < n; k++) {
			arrayA[k] = rn.nextInt(2000000) + 1;
		}

		// LinearSearch
		double start = System.currentTimeMillis();
		int index = 0;
		while (index < n && arrayA[index] != q) {
			index += 1;
		}
		if (index == n) { // comparing primitives, so == is fine
			return System.currentTimeMillis() - start;
		} else {
			// return
			return System.currentTimeMillis() - start;
		}

	}

	// LINEARSEARCH
	public static int LinearSearch(int[] arrayA, int sizeN, int q) {

		// random number rn
		Random rn = new Random();

		// arrayA
		for (int k = 0; k < sizeN; k++) {
			arrayA[k] = rn.nextInt(10) + 1;
		}

		// index
		int index = 0;
		while (index < sizeN && arrayA[index] != q) {
			index += 1;
		}
		if (index == sizeN) { // comparing primitives, so == is fine
			return -1;
		} else {
			// return
			return index;
		}

	}
}
