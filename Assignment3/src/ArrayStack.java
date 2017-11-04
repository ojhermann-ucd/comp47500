// IMPORTS
import java.lang.reflect.Array;

public class ArrayStack<E> implements Stack<E> {

	// OBJECT FIELDS
	// ______________________________________________________________________
	private int arraySize;
	private int arrayTop;
	private E[] stack;
	
	// CONSTRUCTORS
	//______________________________________________________________________
	public ArrayStack(int arraySize) {
		// instatiate field values
		this.arraySize = arraySize;
		this.arrayTop = -1;
		this.stack = (E[])new Object[this.arraySize];
	}
	
	public ArrayStack() {
		this.arraySize = 1000;
		this.arrayTop = -1;
		this.stack = (E[])new Object[this.arraySize];
	}
	
	// METHODS
	public int size() {
		return this.stack.length;
	}
	
	public boolean isEmpty() {
		return this.size() == 0;
	}

}
