
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
			this.rear = ++this.rear % this.capacity; // pre-increment the index
														// and convert to an
														// appropriate figure
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
			this.front = ++this.front % this.capacity; // pre-increment the
														// index and convert to
														// an appropriate figure
			return returnE; // return the object
		}
	}

	// SUPPORTING OPERATIONS
	// ______________________________________________________
	// size()
	public int size() {
		return (this.capacity + this.rear - this.front + 1) % this.capacity;
	}

	// isEmpty()
	public boolean isEmpty() {
		return this.rear == this.front;
	}

	// isFull()
	public boolean isFull() {
		return this.size() == this.capacity;
	}

	// front()
	public E front() throws EmptyQueueException {
		if (this.isEmpty()) {
			throw new EmptyQueueException();
		} else {
			return this.queue[this.front];
		}
	}

	// toString()
	public String toString() {
		// create components of the return object
		String stackString = "";
		String indexString = "";
		// populate return objects
		for (int j = 0; j < this.capacity; j++) {
			stackString += String.format("%-10s", this.queue[j].toString());
			indexString += String.format("%-10d", j);
		}
		// return
		return stackString + "\n" + indexString;
	}

}
