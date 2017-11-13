
public class LinkedStack<E> implements Stack<E> {

	// NESTED CLASS: NODE
	// ______________________________________________________________________
	public class Node<E> {

		// OBJECT FIELDS
		// ______________________________________________________________________
		private E element;
		private Node<E> next;

		// CONSTRUCTORS
		// ______________________________________________________________________
		// with argument
		public Node(E element, Node<E> next) {
			this.element = element;
			this.next = next;
		}

		// no argument
		public Node() {
			this(null, null);
		}

		// ACCESSOR METHODS
		// ______________________________________________________________________
		// getElement()
		public E getElement() {
			return this.element;
		}

		// getNext()
		public Node<E> getNext() {
			return this.next;
		}

		// SETTER METHODS
		// ______________________________________________________________________
		// setElement()
		public void setElement(E element) {
			this.element = element;
		}

		// setNext
		public void setNext(Node<E> next) {
			this.next = next;
		}

	}

	// OBJECT FIELDS
	// ______________________________________________________________________
	private Node<E> top;
	private int size;

	// CONSTRUCTORS
	// ______________________________________________________________________
	// no argument
	public LinkedStack() {
		this.top = null;
		this.size = 0;
	}

	// METHODS
	// ______________________________________________________________________
	// size()
	public int size() {
		return this.size;
	}

	// isEmpty()
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// top()
	public E top() throws EmptyStackException {
		if (this.isEmpty()) {
			throw new EmptyStackException(this.size);
		} else {
			return this.top.getElement();
		}
	}

	// push()
	public void push(E element) {
		// create the new node
		Node<E> node = new Node<E>(element, null);
		// set next to top
		node.setNext(this.top);
		// set top to node
		this.top = node;
		// increase size
		this.size++;
	}

	// pop()
	public E pop() throws EmptyStackException {
		if (this.isEmpty()) {
			throw new EmptyStackException(this.size);
		} else {
			E returnElement = this.top();
			this.top = this.top.getNext();
			this.size--;
			return returnElement;
		}
	}

	// toString()
	@Override
	public String toString() {
		// returns a string representation of the size of the array and its
		// contents
		String stringObject = "";
		Node node = this.top;
		while (node != null) {
			stringObject += node.getElement().toString() + " --> ";
			node = node.getNext();
		}
		String stringRepresentation = String.format("Size: %d", this.size()) + "\t" + "Stack: top --> " + stringObject + "null";
		return stringRepresentation;
	}

}
