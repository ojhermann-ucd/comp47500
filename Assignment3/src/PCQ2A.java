// IMPORTS

public class PCQ2A {

	// main method
	public static void main(String[] args) {

		// create the stack
		ArrayStack<Object> myStack = new ArrayStack();

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
	public static void printPush(ArrayStack<Object> myStack, char theChar) {
		try {
			myStack.push(theChar);
			System.out.println(myStack.toString());
		} catch (FullStackException e) {
			System.out.println(e.getSize());
			e.printStackTrace();
		}
	}

	// printPop()
	public static void printPop(ArrayStack<Object> myStack) {
		try {
			myStack.pop();
			System.out.println(myStack.toString());
		} catch (EmptyStackException e) {
			System.out.println(e.getSize());
			e.printStackTrace();
		}
	}

}
