// IMPORTS

public class ArrayStack<E> implements Stack<E> {

	// CLASS FIELDS
	public static final int CAPACITY = 1000;

	// OBJECT FIELDS
	// ______________________________________________________________________
	private int capacity;
	private int top;
	private E[] stack;

	// CONSTRUCTORS
	// ______________________________________________________________________
	// with argument
	public ArrayStack(int capacity) {
		// instantiate field values
		this.capacity = capacity;
		this.top = -1;
		this.stack = (E[]) new Object[this.capacity];
	}

	// no argument
	public ArrayStack() {
		this(CAPACITY);
	}

	// METHODS
	// ______________________________________________________________________
	// size()
	public int size() {
		// returns number of items in the stack
		return this.top + 1;
	}

	// isEmpty()
	public boolean isEmpty() {
		// returns true if the stack is empty
		return this.size() == 0;
	}

	// push()
	public void push(E element) throws FullStackException {
		// adds item to the stack or throws exception if the stack is full
		if (this.size() == this.capacity) {
			throw new FullStackException(this.size());
		} else {
			this.stack[++this.top] = element; // update top and then update the
												// stack
		}
	}

	// top()
	public E top() throws EmptyStackException {
		// returns the top item of the stack or throws an exception if the stack
		// is empty
		if (this.isEmpty()) {
			throw new EmptyStackException(this.size());
		} else {
			return this.stack[this.top]; // returns the top of the stack
		}
	}

	// pop()
	public E pop() throws EmptyStackException {
		// pops the top of the stack or throws an exception if the stack is empty
		if (this.isEmpty()) {
			throw new EmptyStackException(this.size());
		} else {
			E returnObject = this.top(); // create the return object
			this.stack[this.top--] = null; // assign null to the former top index and post-decrement top
			// return
			return returnObject;
		}
	}
	

	// toString()
	@Override
	public String toString() {
		// returns a string representation of the size of the array and its
		// contents
		String stackString = "";
		String indexString = "";
		// populate stackString
		for (int j = 0; j < this.size(); j++) {
			stackString += String.format("%-10s", this.stack[j].toString());
		}
		for (int j = this.size(); j < this.capacity; j++) {
			stackString += String.format("%-10s", "null");
		}
		// populate indexString
		for (int j = 0; j < this.capacity; j++) {
			indexString += String.format("%-10d", j);
		}
		String stringRepresentation = 
				String.format("Size: %d, Top Index: %d, Capacity: %d\n", this.size(), this.top, this.capacity)
				+ "Stack:\t"
				+ stackString + "\n" 
				+ "Index:\t" + indexString + "\n";
		return stringRepresentation;
	}

}
