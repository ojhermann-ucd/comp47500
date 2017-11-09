
public interface Deque<E> {
	
	// CORE OPERATIONS
	// ______________________________________________________
	
	// inserts E at the start of the Deque
	public void insertFirst(E element);
	
	// inserts E at the end of the Deque
	public void insertLast(E element);
	
	// removes and returns the first element from the Deque 
	public E removeFirst() throws EmptyDequeException;
	
	// removes and returns the last element from the Deque
	public E removeLast() throws EmptyDequeException;
	
	// SUPPORT OPERATIONS
	// ______________________________________________________
	
	// returns the number of elements in the Deque
	public int size();
	
	// returns the empty-status of the Deque
	public boolean isEmpty();
	
	// returns the first item of the Deque
	public E front() throws EmptyDequeException;
	
	// returns the last item of teh Deque
	public E rear() throws EmptyDequeException;

}
