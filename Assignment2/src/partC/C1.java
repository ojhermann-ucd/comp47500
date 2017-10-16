package partC;

public class C1 {
	
	// MAIN
	public static void main(String[] args) {
		
		// headline
		System.out.println("C1: Increment");
		System.out.println("");
		
		// tests
		for (int k = 0; k < 5; k++) {
			double testResult = IncrementTest();
			System.out.println(String.format("Evaluation %d: %f", k, testResult));
		}
		
	}
	
	// INCREMENT TEST
	public static double IncrementTest() {

		// duration
		double duration = 0;

		// iterations
		for (int k = 0; k < 5; k++) {
			double start = System.currentTimeMillis();
			Increment(k);
			double end = System.currentTimeMillis();
			duration += end - start;
		}

		// results smoothing
		duration = duration / 5;
		
		// return
		return duration;

	}
	
	// INCREMENT
	public static int Increment(int a) {
		
		// incrementOutput
		int incrementOutput = a + 1;
		
		// return value
		return incrementOutput;
		
	}

}
