
public class FullStackException extends Exception {
	
	
	// OBJECT FIELDS
	private int stackSize;
	
	
	// CONSTRUCTORS
	public FullStackException (int stackSize) {
		this.stackSize = stackSize;
	}
	
	
	// METHODS
	public String getSize() {
		return String.format("The stack is full i.e. there are %d items in the stack", this.stackSize);
	}
	
	
}
