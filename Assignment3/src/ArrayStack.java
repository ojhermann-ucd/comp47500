// IMPORTS
import java.lang.reflect.Array;

public class ArrayStack<E> implements Stack<E> {
	
	
	// CLASS FIELDS
	public static final int CAPACITY = 1000;

	
	// OBJECT FIELDS
	// ______________________________________________________________________
	private int capacity;
	private int top;
	private E[] stack;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	public ArrayStack(int capacity) {
		// instatiate field values
		this.capacity = capacity;
		this.top = -1;
		this.stack = (E[])new Object[this.capacity];
	}
	
	public ArrayStack() {
		this(CAPACITY);
	}
	
	
	// METHODS
	//______________________________________________________________________
	public int size() {
		// returns number of items in the stack
		return this.top + 1;
	}
	
	public boolean isEmpty() {
		// returns true if the stack is empty
		return this.size() == 0;
	}
	
	public void push (E element) throws FullStackException {
		// adds item to the stack or throws exception if the stack is full
		if (this.size() == this.capacity) {
			throw new FullStackException(this.size());
		} else {
			this.stack[++this.top] = element; // pre-increment top and update the stack
		}
	}

}
