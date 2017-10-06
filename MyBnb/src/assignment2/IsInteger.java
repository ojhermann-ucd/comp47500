package assignment2;

public class IsInteger {
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private String inputString;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specifiedConstructor
	public IsInteger (String inputString) {
		this.inputString = inputString;
	}
	
	
	// CHECK
	//______________________________________________________________________
	public boolean check() throws NumberFormatException {
		
		try {
			
			// convert string to integer
			int propertyType = Integer.parseInt(inputString);
			
			// check propertyType is in the appropriate range
			if (propertyType > 0 && propertyType < 4) {
				return true;
			} else {
				return false;
			}
		
		} catch (NumberFormatException e) {
			// we only care that it is not an appropriate value; we're not asked to correct the document or notify the user
			return false;
		}
	}
	
	
	// getValue()
	//______________________________________________________________________
	public int getValue() {
		return Integer.parseInt(inputString);
	}
}