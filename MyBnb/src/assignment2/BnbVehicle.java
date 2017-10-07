package assignment2;

public class BnbVehicle implements BnbRentItem{
	
	
	// CLASS DATA FIELDS
	//______________________________________________________________________
	static int uniqueRegisterNumber = 0;
	
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int registerNumber;
	private String owner;
	private int daysRented;
	private int rentPerDay;
	private int vehicleType;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbVehicle(String owner, int daysRented, int rentPerDay) {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate field values
		this.registerNumber = uniqueRegisterNumber;
		this.owner = owner;
		this.daysRented = daysRented;
		this.rentPerDay = rentPerDay;
		
	}
	
	
	// empty constructor
	public BnbVehicle() {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate field values
		this.registerNumber = uniqueRegisterNumber;
		this.owner = null;
		this.daysRented = 0;
		this.rentPerDay = 0;
		
	}
	
	
	// SETTER METHODS
	//______________________________________________________________________
	// owner
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	// daysRented
	public void setdaysRented(int daysRented) {
		this.daysRented = daysRented;
	}
	
	// rentPerDay
	public void setrentPerDay(int rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	
	// vehicleType
	public void setVehicleType(int vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	
	// GETTER METHODS
	//______________________________________________________________________
	// getRegisterNumber
	public int getRegisterNumber() {
		return this.registerNumber;
	}
	
	// getOwner
	public String getOwner() {
		return this.owner;
	}
	
	// getdaysRented
	public int getdaysRented() {
		return this.daysRented;
	}
	
	// getrentPerDay
	public int getrentPerDay() {
		return this.rentPerDay;
	}
	
	// propertyType
	public int getVehicleType() {
		return this.vehicleType;
	}
	
	// uniqueRegisterNumber
	public static int getUniqueRegisterNumber() {
		return uniqueRegisterNumber;
	}
	
	
	// OTHER METHODS
	//______________________________________________________________________	
	// toString
	@Override
	public String toString() {
		return
				"Register Number: " + String.valueOf(this.getRegisterNumber()) + "\n" +
				"Owner: " + this.getOwner().toString() + "\n" +
				"Days Rented: " + String.valueOf(this.getdaysRented()) + "\n" +
				"Rent Per Day: " + String.valueOf(this.getrentPerDay()) + "\n";
	}
	
	
	// rentalItem
	public void rentalItem(int moreRentalDays) {
		this.daysRented += moreRentalDays - 1;
	}
}
