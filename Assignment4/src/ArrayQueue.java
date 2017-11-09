
public class ArrayQueue<E> implements Queue<E> {

	// CLASS FIELDS
	// ______________________________________________________
	public static final int CAPACITY = 1000;

	// OBJECT FIELDS
	// ______________________________________________________
	private E[] queue;
	private int capacity;
	private int front;
	private int rear;

	// CONSTRUCTORS
	// ______________________________________________________________________
	// with argument
	public ArrayQueue(int capacity) {
		this.queue = (E[]) new Object[capacity];
		this.capacity = capacity;
		this.front = 0;
		this.rear = 0;
	}

	// no argument
	public ArrayQueue() {
		this(CAPACITY);
	}

	// CORE OPERATIONS
	// ______________________________________________________
	// enqueue()
	public void enqueue(E element) throws FullQueueException {
		if (this.size() == this.capacity) {
			throw new FullQueueException();
		} else {
			this.queue[this.rear] = element;
			this.rear = ++this.rear % this.capacity;
		}
	}
	
	// dequeue()
	public E dequeue() throws EmptyQueueException {
		if (this.isEmpty()) {
			throw new EmptyQueueException();
		} else {
			E returnE = this.queue[this.front];
			this.queue[front] = null;
			this.front = ++this.front % this.capacity;
			return returnE;
		}
	}

	// SUPPORTING OPERATIONS
	// ______________________________________________________
	public int size();

	public boolean isEmpty();

	public E front() throws EmptyQueueException;

	public String toString();

}
