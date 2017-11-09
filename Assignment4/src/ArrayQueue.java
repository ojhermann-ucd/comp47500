
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
		if (this.isFull()) {
			throw new FullQueueException();
		} else {
			this.rear = ++this.rear % this.capacity; // pre-increment the index and convert to an appropriate figure
			this.queue[this.rear] = element; // put the element into the array
		}
	}
	
	// dequeue()
	public E dequeue() throws EmptyQueueException {
		if (this.isEmpty()) {
			throw new EmptyQueueException();
		} else {
			E returnE = this.queue[this.front]; // obtain the desired object
			this.queue[this.front] = null; // clear out the existing entry
			this.front = ++this.front % this.capacity; // pre-increment the index and convert to an appropriate figure
			return returnE; // return the object
		}
	}

	// SUPPORTING OPERATIONS
	// ______________________________________________________
	public int size() {
		return (this.capacity + this.rear - this.front + 1) % this.capacity;
	}

	public boolean isEmpty() {
		return this.rear == this.front;
	}
	
	public boolean isFull() {
		return this.size() == this.capacity;
	}

	public E front() throws EmptyQueueException;

	public String toString();

}
