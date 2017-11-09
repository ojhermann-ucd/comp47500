
public interface Queue<E> {

	// CORE OPERATIONS
	// ______________________________________________________
	public void enqueue(E element) throws FullQueueException;

	public E dequeue() throws EmptyQueueException;

	// SUPPORTING OPERATIONS
	// ______________________________________________________
	public int size();
	
	public boolean isEmpty();
	
	public E front() throws EmptyQueueException;
	
	public String toString();

}