package partC;

//IMPORTS
import java.util.Arrays;
import java.util.Random;

public class C10 {

	// LINEARSEARCHTEST
	public static double LinearSearchTest(int[] arrayA, int sizeN, int q) {
		// nValues
		int[] nValues = { 100000, 200000, 500000, 1000000, 2000000 };
		// iterValue
		int iterValue = 300;
		
		// run tests
		for (int n: nValues) {
			double averageTime = 0;
			for (int j = 0; j < iterValue; j++) {
				
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
