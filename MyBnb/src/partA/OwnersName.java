package partA;

public class OwnersName {
	
	// data fields
	private String firstName;
	private String lastName;
	
	// constructor
	public OwnersName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//toString()
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

}
