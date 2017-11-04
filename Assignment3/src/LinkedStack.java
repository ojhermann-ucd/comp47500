
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
}
