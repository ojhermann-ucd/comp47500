package partA;

public class BnbProperty {
	
	// class data fields
	static int uniqueRegisterNumber = 0;
	
	// object data fields
	
	
	// constructor
	public BnbProperty(int registerNumber) {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate values
		registerNumber = uniqueRegisterNumber;
	}
	

}
