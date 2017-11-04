
public class EmptyStackException extends Exception {
	
	
	// OBJECT FIELDS
	private int stackSize;
	
	
	// CONSTRUCTORS
	public EmptyStackException (int stackSize) {
		this.stackSize = stackSize;
	}
	
	
	// METHODS
	public String getSize() {
		return String.format("The stack is empty i.e. there are %d items in the stack", this.stackSize);
	}
	
	
}
