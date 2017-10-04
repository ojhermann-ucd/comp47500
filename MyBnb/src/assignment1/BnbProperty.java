package assignment1;

public class BnbProperty {
	
	
	// CLASS DATA FIELDS
	//______________________________________________________________________
	static int uniqueRegisterNumber = 0;
	
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int registerNumber;
	private String name;
	private String address;
	private int rate;
	private int days;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
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
	//______________________________________________________________________
	// name
	public void setName(String name) {
		this.name = name;
	}
	
	// address
	public void setAddress(String address) {
		this.address = address;
	}
	
	// rate
	public void setRate(int rate) {
		this.rate = rate;
	}
	
	// days
	public void setDays(int days) {
		this.days = days;
	}
	
	
	// GETTER METHODS
	//______________________________________________________________________
	// name
	public String getName() {
		return name;
	}
	
	// address
	public String getAddress() {
		return address;
	}
	
	// rate
	public int getRate() {
		return rate;
	}
	
	// days
	public int getDays() {
		return days;
	}
		

}