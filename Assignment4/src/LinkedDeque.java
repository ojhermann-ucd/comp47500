
public class LinkedDeque<E> implements Deque<E> {

	// NESTED CLASS: DLNODE
	// ______________________________________________________________________
	public class DLNode<E> {
		// OBJECT FIELDS
		// ______________________________________________________________________
		private E element;
		DLNode<E> prev;
		DLNode<E> next;

		// CONSTRUCTORS
		// ______________________________________________________________________
		// with argument
		public DLNode(E element, DLNode<E> prev, DLNode<E> next) {
			this.element = element;
			this.prev = prev;
			this.next = next;
		}

		// no argument
		public DLNode() {
			this(null, null, null);
		}

		// GETTER METHODS
		// ______________________________________________________________________
		// getElement()
		public E getElement() {
			return this.element;
		}

		// getPrev()
		public DLNode<E> getPrev() {
			return this.prev;
		}

		// getNext()
		public DLNode<E> getNext() {
			return this.next;
		}

		// SETTER METHODS
		// ______________________________________________________________________
		// setElement()
		public void setElement(E element) {
			this.element = element;
		}

		// setPrev()
		public void setPrev(DLNode<E> prev) {
			this.prev = prev;
		}

		// setNext()
		public void setNext(DLNode<E> next) {
			this.next = next;
		}

	}

	// OBJECT FIELDS
	// ______________________________________________________________________
	private int size;
	private DLNode<E> front;
	private DLNode<E> rear;

	// CONSTRUCTORS
	// ______________________________________________________________________
	public LinkedDeque() {
		this.size = 0;
		this.front = new DLNode(null, null, null);
		this.rear = new DLNode(null, null, null);
		this.front.setNext(this.rear);
		this.front.setPrev(this.rear);
		this.rear.setNext(this.front);
		this.rear.setPrev(this.front);
	}

	// CORE OPERATIONS
	// ______________________________________________________________________
	// emptyInsertion()
	public void emptyInsertion(E element) {
		DLNode<E> node = new DLNode(element, this.front, this.rear);
		this.front.setNext(node);
		this.rear.setPrev(node);
		this.size++;
	}

	// insertFirst()
	public void insertFirst(E element) {
		if (this.front.getNext() == rear) {
			this.emptyInsertion(element);
		} else {
			DLNode<E> node = new DLNode(element, this.front, this.front.getNext());
			this.front.getNext().setPrev(node);
			this.front.setNext(node);
			this.size++;
		}
	}

	// insertLast()
	public void insertLast(E element) {
		if (this.rear.getPrev() == this.front) {
			this.emptyInsertion(element);
		} else {
			DLNode<E> node = new DLNode(element, this.rear.getPrev(), this.rear);
			this.rear.getPrev().setNext(node);
			this.rear.setPrev(node);
			this.size++;
		}
	}

	// removeFirst()
	public E removeFirst() throws EmptyDequeException {
		if (this.isEmpty()) {
			throw new EmptyDequeException();
		} else {
			DLNode<E> oldFirst = this.front.getNext();
			DLNode<E> newFirst = oldFirst.getNext();
			this.front.setNext(newFirst);
			newFirst.setPrev(this.front);
			this.size--;
			return oldFirst.getElement();
		}
	}

	// removeLast()
	public E removeLast() throws EmptyDequeException {
		if (this.isEmpty()) {
			throw new EmptyDequeException();
		} else {
			DLNode<E> oldLast = this.rear.getPrev();
			DLNode<E> newLast = oldLast.getPrev();
			this.rear.setPrev(newLast);
			newLast.setNext(this.rear);
			this.size--;
			return oldLast.getElement();
		}
	}

	// SUPPORT OPERATIONS
	// ______________________________________________________________________
	// size()
	public int size() {
		return this.size;
	}

	// isEmpty()
	public boolean isEmpty() {
		return this.size == 0;
	}

	// front()
	public E front() throws EmptyDequeException {
		if (this.isEmpty()) {
			throw new EmptyDequeException();
		} else {
			return this.front.getNext().getElement();
		}
	}

	// rear()
	public E rear() throws EmptyDequeException {
		if (this.isEmpty()) {
			throw new EmptyDequeException();
		} else {
			return this.rear.getPrev().getElement();
		}
	}

	// TO STRING
	// ______________________________________________________________________
	// toString()
	@Override
	public String toString() {
		try {
			if (this.isEmpty()) {
				return "front <--> rear";
			} else {
				DLNode<E> node = this.front.getNext();
				E element = this.front();
				String stringObject = "";
				while (element != null) {
					stringObject += " <--> " + element.toString();
					node = node.getNext();
					element = node.getElement();
				}
				return "front" + stringObject + " <--> rear";
			}
		} catch (EmptyDequeException e) {
			return e.getMessage();
		}
	}
}
