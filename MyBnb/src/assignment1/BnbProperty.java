package assignment1;


//IMPORTS
import java.util.List;
import java.util.ArrayList;


public class BnbProperty {
	
	
	// CLASS DATA FIELDS
	//______________________________________________________________________
	static int uniqueRegisterNumber = 0;
	static List<BnbProperty> propertyList = new ArrayList<BnbProperty>();
	
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int registerNumber;
	private String postalAddress;
	private String ownersName;
	private int rentPerDay;
	private int daysRented;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbProperty(String postalAddress, String ownersName, int rentPerDay, int daysRented) {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate field values
		this.registerNumber = uniqueRegisterNumber;
		this.postalAddress = postalAddress;
		this.ownersName = ownersName;
		this.rentPerDay = rentPerDay;
		this.daysRented = daysRented;
		
		// add to propertyList
		propertyList.add(this);
		
	}
	
	// empty constructor
	public BnbProperty() {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate field values
		this.registerNumber = uniqueRegisterNumber;
		this.postalAddress = null;
		this.ownersName = null;
		this.rentPerDay = 0;
		this.daysRented = 0;
		
		// add to propertyList
		propertyList.add(this);
		
	}
	
	
	// SETTER METHODS
	//______________________________________________________________________
	// postalAddress
	public void setPostalAddress(String address) {
		this.postalAddress = address;
	}
	
	// ownersName
	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}
	
	// rentPerDay
	public void setRentPerDay(int rentalDayRate) {
		this.rentPerDay = rentalDayRate;
	}
	
	// daysRented
	public void setDaysRented(int daysRented) {
		this.daysRented = daysRented;
	}
	
	
	// GETTER METHODS
	//______________________________________________________________________
	// registerNumber
	public int getRegisterNumber() {
		return this.registerNumber;
	}
	
	// postalAddress
	public String getPostalAddress() {
		return this.postalAddress;
	}
	
	// ownersName
	public String getOwnersName() {
		return this.ownersName;
	}
	
	// rentPerDay
	public int getRentPerDay() {
		return this.rentPerDay;
	}
	
	// daysRented
	public int getDaysRented() {
		return this.daysRented;
	}
	
	// getPropertyList
	public List<BnbProperty> getPropertyList() {
		return propertyList;
	}
	
	
	// OTHER METHODS
	//______________________________________________________________________	
	// toString
	@Override
	public String toString() {
		return 
				"Register Number: " + String.valueOf(this.getRegisterNumber()) + "\n" +
				"Address: " + this.getPostalAddress().toString() + "\n" +
				"Owner: " + this.getOwnersName().toString() + "\n" +
				"Days Rented: " + String.valueOf(this.getDaysRented()) + "\n" +
				"Rent Per Day: " + String.valueOf(this.getRentPerDay()) + "\n";
	}
	
	// rentProperty
	public void rentProperty(int days) {
		this.daysRented = this.daysRented + days;
	}
		

}

