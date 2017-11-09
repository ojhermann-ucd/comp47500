// IMPORTS


public interface Stack<E> {
	
	// size: returns the number of elements in the stack
	public int size();
	
	// isEmpty: returns true if the stack is empty; false otherwise
	public boolean isEmpty();
	
	// top: returns top element in the stack; throws exception if the stack is empty
	public E top() throws EmptyStackException;
	
	// push: inserts an element to the top of the stack; throws an exception if the stack is full 
	public void push(E element) throws FullStackException;
	
	// pop: removes the top element from the stack and returns it; throws an exception if the stack is empty
	public Object pop() throws EmptyStackException;
	
	// toString: returns a string representation of the stack, including the size and the contents, starting with the bottom
	public String toString();
	
}
