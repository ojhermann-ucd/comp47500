package partB;


// IMPORTS
import java.util.Arrays;
import java.util.Random;


public class B10 {
	
	// MAIN
	public static void main (String[] args) {
		
		// random number rn
		Random rn = new Random();
		
		int sizeN = 5;
		int[] arrayA = new int[sizeN];
		int q = rn.nextInt(10) + 1;
		LinearSearch(arrayA, sizeN, q);
		
		
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
			index = -1;
		}
		
		// message to grader
		String outputMessage = "The output of LinearSearch(" + Arrays.toString(arrayA) + ", " + String.valueOf(sizeN)  + ", " + String.valueOf(q) + ") is ";
		System.out.print(outputMessage);
		System.out.println(index);
		
		// return
		return index;
	}

}
