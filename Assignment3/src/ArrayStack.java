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
		// count objects until a null object is found or end of array is reached; return the count
		int objectCount = 0;
		while (objectCount < this.stack.length && this.stack[objectCount] != null) {
			objectCount += 1;
		}
		return objectCount;
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}
	
	

}
