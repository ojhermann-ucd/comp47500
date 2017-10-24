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
		
		System.out.println("B10: LinearSearch");
		System.out.println("");
		
		System.out.println("Note to Grader");
		System.out.println("I kept int n as an input so that you could modify the size of the arrays");
		System.out.println("All arrays are populated with random numbers between 1 and 10, inclusive");
		System.out.println("");
		
		// random number rn
		Random rn = new Random();
		
		// arrayA
		for (int k = 0; k < sizeN; k++) {
			arrayA[k] = rn.nextInt(10) + 1;
		}
		
		System.out.println("INPUTS");
		System.out.println("arrayA is " + Arrays.toString(arrayA));
		System.out.println("n is " + String.valueOf(sizeN));
		System.out.println("q is " + String.valueOf(q));
		System.out.println("");
		
		// index
		System.out.println("Algorithm");
		int index = 0;
		System.out.println("index <-- 0");
		System.out.println("");
		while (index < sizeN && arrayA[index] != q) {
			System.out.println(String.format("index = %d < %d = n and A[index] = %d <> %d = q", index, sizeN, arrayA[index], q));
			index += 1;
			System.out.println(String.format("  index <-- index + 1 = %d + 1 = %d", index-1, index));
			System.out.println("");
		}
		if (index == sizeN) { // comparing primitives, so == is fine
			System.out.println(String.format("index = %d = n", sizeN));
			System.out.println("  return -1");
			System.out.println("");
			System.out.println("Summary");
			String outputMessage = "LinearSearch(" + Arrays.toString(arrayA) + ", " + String.valueOf(sizeN)  + ", " + String.valueOf(q) + ") = -1";
			System.out.print(outputMessage);
			return -1;
		} else {
			System.out.println(String.format("index = %d < %d = n and A[index] = %d == %d = q", index, sizeN, arrayA[index], q));
			System.out.println("");
			System.out.println(String.format("index = %d <> %d = n", index, sizeN));
			System.out.println(String.format("  return index = %d", index));
			System.out.println("");
			
			// message to grader
			System.out.println("Summary");
			String outputMessage = "LinearSearch(" + Arrays.toString(arrayA) + ", " + String.valueOf(sizeN)  + ", " + String.valueOf(q) + ") is ";
			System.out.print(outputMessage);
			System.out.println(index);
			
			// return
			return index;
		}
		
	}

}
