
public class EmptyQueueException extends Exception {
	
	// CONSTRUCTORS
	public EmptyQueueException() {
	}

	// METHODS
	public String getMessage() {
		return String.format("The queue is empty");
	}
}
