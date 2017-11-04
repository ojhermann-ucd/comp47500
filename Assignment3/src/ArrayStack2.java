// IMPORTS
import java.lang.reflect.Array;

public class ArrayStack2<E> implements Stack<E> {

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
		this.stack = (E[])new Object[arraySize];
	}
	
	public ArrayStack(Class<E> c, int arraySize) {
		this.arraySize = arraySize;
		this.arrayTop = -1;
		this.stack = (E[]) Array.newInstance(c, arraySize);
	}

}
