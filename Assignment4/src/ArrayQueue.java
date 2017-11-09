
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
			this.queue[this.front] = null;
			this.front = ++this.front % this.capacity;
			return returnE;
		}
	}

	// SUPPORTING OPERATIONS
	// ______________________________________________________
	// size()
	public int size() {
		if (this.isEmpty()) {
			return 0;
		} else {
			int theSize = (this.capacity + this.rear - this.front) % this.capacity;
			return theSize == 0 ? this.capacity : theSize;
		}

	}

	// isEmpty()
	public boolean isEmpty() {
		return this.queue[this.front] == null;
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
		String boundaryString = "";
		// populate return objects
		for (int j = 0; j < this.capacity; j++) {
			stackString += String.format("%-10s", this.queue[j] == null ? "null" : this.queue[j].toString());
			indexString += String.format("%-10d", j);
			if (this.isEmpty() && j == this.front && j == this.rear) {
				boundaryString += String.format("%-10s", "fr");
			} else if (j == this.front && j == this.rear) {
				boundaryString += String.format("%-10s", "rf");
			} else if (j == this.front) {
				boundaryString += String.format("%-10s", "f");
			} else if (j == this.rear) {
				boundaryString += String.format("%-10s", "r");
			} else {
				boundaryString += String.format("%-10s", "");
			}
		}
		// return
		return String.format("Size: %-10d\n", this.size(), this.front, this.rear) + stackString + "\n" + indexString
				+ "\n" + boundaryString + "\n";
	}

}
