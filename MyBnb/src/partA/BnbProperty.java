package partA;

public class BnbProperty {
	
	
	// CLASS DATA FIELDS
	static int uniqueRegisterNumber = 0;
	
	
	// OBJECT DATA FIELDS
	private int registerNumber;
	private String name;
	private String address;
	private int rate;
	private int days;
	
	
	// CONSTRUCTORS
	// specified constructor
	public BnbProperty(String name, String address, int rate, int days) {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate field values
		this.registerNumber = uniqueRegisterNumber;
		this.name = name;
		this.address = address;
		this.rate = rate;
		this.days = days;
		
	}
	
	// empty constructor
	public BnbProperty() {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate field values
		this.registerNumber = uniqueRegisterNumber;
		this.name = null;
		this.address = null;
		this.rate = 0;
		this.days = 0;
		
	}
	
	// SETTER METHODS
	
	

}
