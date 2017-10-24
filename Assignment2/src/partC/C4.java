package partC;

//IMPORTS
import java.util.Random;

public class C4 {

	// MAIN
	public static void main(String[] args) {
		
		// random number: rn
		Random rn = new Random();
		
		// averageResult
		double averageResult = 0;
		
		for (int j = 0; j < 5; j++) {
			// create two inputs
			int a = rn.nextInt(10) + 1;
			int b = rn.nextInt(10) + 1;
			double testResult = DifferenceTest(a, b);
			averageResult += testResult;
		
		// aveageResult
		averageResult /= 5;

		}
		
		// print results
		System.out.println(String.format("Run time: %f", averageResult));
	}

	// DIFFERENCE
	public static double DifferenceTest(int a, int b) {

		// differenceOutput
		int differenceOutput;
		double start = System.currentTimeMillis();
		if (a > b) {
			differenceOutput = a - b;
		} else {
			differenceOutput = b - a;
		}
		double end = System.currentTimeMillis();

		// return
		return end - start;

	}

}
