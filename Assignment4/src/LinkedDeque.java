
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
		this.front = null;
		this.rear = null;
	}

	// CORE OPERATIONS
	// ______________________________________________________________________
	// emptyInsertion()
	public void emptyInsertion(E element) {
		DLNode<E> node = new DLNode(element, null, null);
		this.front = node;
		this.rear = this.front;
		this.size++;
	}

	// insertFirst()
	public void insertFirst(E element) {
		if (this.isEmpty()) {
			this.emptyInsertion(element);
		} else {
			DLNode<E> node = new DLNode(element, null, this.front);
			this.front.setPrev(node);
			this.front = node;
			this.size++;
		}
	}

	// insertLast()
	public void insertLast(E element) {
		if (this.isEmpty()) {
			this.emptyInsertion(element);
		} else {
			DLNode<E> node = new DLNode(element, this.rear, null);
			this.rear.setNext(node);
			this.rear = node;
			this.size++;
		}
	}

	// removeFirst()
	public E removeFirst() throws EmptyDequeException {
		if (this.isEmpty()) {
			throw new EmptyDequeException();
		} else {
			E returnElement = this.front.getElement();
			this.front = this.front.next;
			if (this.front == null) {
				this.rear = null;
			} else {
				this.front.prev = null;
			}
			this.size--;
			return returnElement;
		}
	}

	// removeLast()
	public E removeLast() throws EmptyDequeException {
		if (this.isEmpty()) {
			throw new EmptyDequeException();
		} else {
			E returnElement = this.rear.getElement();
			this.rear = this.rear.prev;
			if (this.rear == null) {
				this.front = null;
			} else {
				this.rear.next = null;
			}
			this.size--;
			return returnElement;
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
			return this.front.getElement();
		}
	}

	// rear()
	public E rear() throws EmptyDequeException {
		if (this.isEmpty()) {
			throw new EmptyDequeException();
		} else {
			return this.rear.getElement();
		}
	}

	// TO STRING
	// ______________________________________________________________________
	// toString()
	@Override
	public String toString() {
		if (this.isEmpty()) {
			String elementObject = String.format("%-10s", "null");
			String pointerObject = String.format("%-10s", "^");
			String idObject = String.format("%-10s", "front & rear");
			return elementObject + "\n" + pointerObject + "\n" + idObject;
		} else if (this.size == 1) {
			DLNode<E> node = this.front;
			String elementObject = String.format("%-10s", "null <-- " + node.getElement().toString()) + " --> null";
			String pointerObject = String.format("%-10s", "         ^         ");
			String idObject = String.format("%-10s", "   front & rear");
			return elementObject + "\n" + pointerObject + "\n" + idObject;
		} else if (this.size == 2) {
			String firstHalf = "null <-- " + this.front.getElement().toString() + " <--> ";
			String secondHalf = this.rear.getElement().toString() + " --> null";
			String elementObject = firstHalf + secondHalf;
			String pointerObject = "         ^";
			for (int k = 0; k < firstHalf.length() - 10; k++) {
				pointerObject += " ";
			}
			pointerObject += "^";
			String idObject = "         front";
			for (int k = 0; k < firstHalf.length() - 14; k++) {
				idObject += " ";
			}
			idObject += "rear";
			return elementObject + "\n" + pointerObject + "\n" + idObject;
		}
		
		else {
			String stringObject = "";
			String elementObject = "";
			String pointerObject = "";
			String idObject = "";
			DLNode<E> node = this.front;
			for (int j = 0; j < this.size; j++) {
				if (j == 0) {
					String firstString = "null <-- ";
					String mainString = firstString + node.getElement().toString();
					elementObject += mainString;
					for (int k = 0; k < firstString.length(); k++) {
						pointerObject += " ";
						idObject += " ";
					}
					pointerObject += "^";
					idObject += "front";
					for (int k = 0; k < mainString.length() - firstString.length(); k++) {
						pointerObject += " ";
					}
					for (int k = 0; k < mainString.length() - firstString.length() - "front".length() + 1; k++) {
						idObject += " ";
					}
				} else if (j == this.size - 1) {
					String secondString = " --> null";
					String mainString = node.getElement().toString() + secondString;
					elementObject += mainString;
					pointerObject += "^";
					idObject += "rear";
				} else {
					String mainString = " <--> " + node.getElement().toString() + " <--> ";
					elementObject += mainString;
					for (int k = 0; k < mainString.length(); k++) {
						pointerObject += " ";
						idObject += " ";
					}
				}
				node = node.getNext();
			}
			return elementObject + "\n" + pointerObject + "\n" + idObject;
		}
	}
}
