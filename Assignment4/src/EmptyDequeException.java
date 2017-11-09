
public class EmptyDequeException extends Exception{

	// CONSTRUCTORS
	public EmptyDequeException () {
	}

	// METHODS
	public String getMessage() {
		return String.format("The deque is empty");
	}

}
