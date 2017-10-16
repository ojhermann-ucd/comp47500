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
	public static double[] PrefixAverages(int[] arrayA, int n) {
		
		System.out.println("B7: PrefixAverages");
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
		
		//arrayX
		System.out.println("");
		System.out.println("Algorithm");
		double[] arrayX = new double[n];
		System.out.println(Arrays.toString(arrayX) + " <-- arrayX");
		double runningSum = 0;
		System.out.println("runningSum <-- 0");
		System.out.println("");
		for (int k = 0; k < n; k++) {
			String runningSumMessage = "runningSum <-- runningSum + " + "arrayA[" + String.valueOf(k) + "] = " + String.valueOf(runningSum) + " + " + String.valueOf(arrayA[k]) + " = " + String.valueOf(runningSum + arrayA[k]);
			runningSum += arrayA[k];
			arrayX[k] = runningSum / (k + 1);
			String arrayXMessage = "arrayX[" + String.valueOf(k) + "] <-- " + String.valueOf(arrayX[k]) + " = " + String.valueOf(runningSum) + " / " + String.valueOf(k + 1) + " = runningSum / k + 1 i.e. arrayX <-- " + Arrays.toString(arrayX);
			System.out.println(runningSumMessage);
			System.out.println(arrayXMessage);
			System.out.println("");
		}
		
		// message to grader
		System.out.println("");
		System.out.println("Summary");
		String outputMessage = "PrefixAverage(" + Arrays.toString(arrayA) + ", " + String.valueOf(n) +") = ";
		System.out.print(outputMessage);
		System.out.println(Arrays.toString(arrayX));
		// return
		return arrayX;
		
	}

}
