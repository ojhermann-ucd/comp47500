
public class PCQ2L {
	// main method
	public static void main(String[] args) {

		// create the stack
		LinkedStack<Object> myStack = new LinkedStack();

		// Initial state
		System.out.println(myStack.toString());

		// push('e')
		printPush(myStack, 'e');

		// push('s')
		printPush(myStack, 's');

		// push('c')
		printPush(myStack, 'c');

		// pop()
		printPop(myStack);

		// push('u')
		printPush(myStack, 'u');

		// push('a')
		printPush(myStack, 'a');

		// pop()
		printPop(myStack);

		// push('o')
		printPush(myStack, 'o');

		// push('t')
		printPush(myStack, 't');

		// pop()
		printPop(myStack);

		// push('h')
		printPush(myStack, 'h');

	}

	// printPush()
	public static void printPush(LinkedStack<Object> myStack, char theChar) {
		myStack.push(theChar);
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
