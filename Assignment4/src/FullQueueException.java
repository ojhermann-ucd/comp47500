
public class FullQueueException extends Exception {

	// CONSTRUCTORS
	public FullQueueException() {
	}

	// METHODS
	public String getMessage() {
		return String.format("The queue is full");
	}
}
