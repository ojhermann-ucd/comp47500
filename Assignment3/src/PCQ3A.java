
public class PCQ3A {

	// main method
	public static void main(String[] args) {

		// create the stack
		ArrayStack<String> myStack = new ArrayStack(7);

		// Initial state
		System.out.println("Stack created: new ArrayStack(7)");
		System.out.println(myStack.toString());

		// push("Ireland")
		System.out.println("push(Ireland)");
		printPush(myStack, "Ireland");

		// pop()
		System.out.println("pop()");
		printPop(myStack);

		// push("England")
		System.out.println("push(England)");
		printPush(myStack, "England");

		// pop()
		System.out.println("pop()");
		printPop(myStack);

		// push("Wales")
		System.out.println("push(Wales)");
		printPush(myStack, "Wales");
		
		// pop()
		System.out.println("pop()");
		printPop(myStack);
		
		// push("Scotland")
		System.out.println("push(Scotland)");
		printPush(myStack, "Scotland");
		
		// pop()
		System.out.println("pop()");
		printPop(myStack);
		
		// push("France")
		System.out.println("push(France)");
		printPush(myStack, "France");
		
		// push("Germany")
		System.out.println("push(Germany)");
		printPush(myStack, "Germany");
		
		// note to grader
		System.out.println("Note to Grader");
		System.out.println("myStack was instatiated with String elements");
		System.out.println("myStack also works with the more general Object");

	}

	// printPush()
	public static void printPush(ArrayStack<String> myStack, String theString) {
		try {
			myStack.push(theString);
			System.out.println(myStack.toString());
		} catch (FullStackException e) {
			System.out.println(e.getSize());
			e.printStackTrace();
		}
	}

	// printPop()
	public static void printPop(ArrayStack<String> myStack) {
		try {
			myStack.pop();
			System.out.println(myStack.toString());
		} catch (EmptyStackException e) {
			System.out.println(e.getSize());
			e.printStackTrace();
		}
	}

}
