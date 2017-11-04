
public class PCQ3L {

	// main method
	public static void main(String[] args) {

		// create the stack
		LinkedStack<Object> myStack = new LinkedStack();

		// Initial state
		System.out.println(myStack.toString());

		// push("Ireland")
		printPush(myStack, "Ireland");

		// pop()
		printPop(myStack);

		// push("England")
		printPush(myStack, "England");

		// pop()
		printPop(myStack);

		// push("Wales")
		printPush(myStack, "Wales");

		// pop()
		printPop(myStack);

		// push("Scotland")
		printPush(myStack, "Scotland");

		// pop()
		printPop(myStack);

		// push("France")
		printPush(myStack, "France");

		// push("Germany")
		printPush(myStack, "Germany");

	}

	// printPush()
	public static void printPush(LinkedStack<Object> myStack, String theString) {
		myStack.push(theString);
		System.out.println(myStack.toString());
	}

	// printPop()
	public static void printPop(LinkedStack<Object> myStack) {
		try {
			myStack.pop();
			System.out.println(myStack.toString());
		} catch (EmptyStackException e) {
			System.out.println(e.getSize());
			e.printStackTrace();
		}
	}

}
