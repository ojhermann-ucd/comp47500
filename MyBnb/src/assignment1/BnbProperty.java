package assignment1;


public class BnbProperty {
	
	
	// CLASS DATA FIELDS
	//______________________________________________________________________
	static int uniqueRegisterNumber = 0;
	
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int registerNumber;
	private String ownersName;
	private String address;
	private int rentalDayRate;
	private int daysRented;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbProperty(String ownersName, String address, int rentalDayRate, int daysRented) {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate field values
		this.registerNumber = uniqueRegisterNumber;
		this.ownersName = ownersName;
		this.address = address;
		this.rentalDayRate = rentalDayRate;
		this.daysRented = daysRented;
		
	}
	
	// empty constructor
	public BnbProperty() {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate field values
		this.registerNumber = uniqueRegisterNumber;
		this.ownersName = null;
		this.address = null;
		this.rentalDayRate = 0;
		this.daysRented = 0;
		
	}
	
	
	// SETTER METHODS
	//______________________________________________________________________
	// name
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}
	
	// address
	public void setAddress(String address) {
		this.address = address;
	}
	
	// rate
	public void setRentalDayRate(int rentalDayRate) {
		this.rentalDayRate = rentalDayRate;
	}
	
	// days
	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}
	
	
	// GETTER METHODS
	//______________________________________________________________________
	// name
	public String getOwnersName() {
		return ownersName;
	}
	
	// address
	public String getAddress() {
		return address;
	}
	
	// rate
	public int getRentalDayRate() {
		return rentalDayRate;
	}
	
	// days
	public int getDaysRented() {
		return daysRented;
	}
	
	
	// OTHER METHODS
	//______________________________________________________________________
	// rentProperty
	public void rentProperty(int rentalDays) {
		this.daysRented = daysRented + rentalDays;
	}
		

}

