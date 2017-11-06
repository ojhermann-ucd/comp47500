// IMPORTS

public class PCQ2A {

	// main method
	public static void main(String[] args) {

		// create the stack
		ArrayStack<Object> myStack = new ArrayStack(5);

		// Initial state
		System.out.println("Stack created: new ArrayStack(5)");
		System.out.println(myStack.toString());

		// push('e')
		System.out.println("push('e')");
		printPush(myStack, 'e');

		// push('s')
		System.out.println("push('s')");
		printPush(myStack, 's');

		// push('c')
		System.out.println("push('c')");
		printPush(myStack, 'c');

		// pop()
		System.out.println("pop()");
		printPop(myStack);

		// push('u')
		System.out.println("push('u')");
		printPush(myStack, 'u');

		// push('a')
		System.out.println("push('a')");
		printPush(myStack, 'a');

		// pop()
		System.out.println("pop()");
		printPop(myStack);

		// push('o')
		System.out.println("push('o')");
		printPush(myStack, 'o');

		// push('t')
		System.out.println("push('t')");
		printPush(myStack, 't');

		// pop()
		System.out.println("pop()");
		printPop(myStack);

		// push('h')
		System.out.println("push('h')");
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
