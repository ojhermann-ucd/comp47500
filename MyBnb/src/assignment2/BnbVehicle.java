package assignment2;

public class BnbVehicle implements BnbRentItem{
	
	
	// CLASS DATA FIELDS
	//______________________________________________________________________
	static int uniqueRegisterNumber = 0;
	
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int registerNumber;
	private String owner;
	private int totalRentalDays;
	private int rentalCostPerDay;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbVehicle(String owner, int totalRentalDays, int rentalCostPerDay) {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate field values
		this.registerNumber = uniqueRegisterNumber;
		this.owner = owner;
		this.totalRentalDays = totalRentalDays;
		this.rentalCostPerDay = rentalCostPerDay;
		
	}
	
	
	// empty constructor
	public BnbVehicle() {
		
		// increment uniqueRegisterNumber
		uniqueRegisterNumber++;
		
		// instantiate field values
		this.registerNumber = uniqueRegisterNumber;
		this.owner = null;
		this.totalRentalDays = 0;
		this.rentalCostPerDay = 0;
		
	}
	
	
	// SETTER METHODS
	//______________________________________________________________________
	// owner
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	// totalRentalDays
	public void setTotalRentalDays(int totalRentalDays) {
		this.totalRentalDays = totalRentalDays;
	}
	
	// rentalCostPerDay
	public void setRentalCostPerDay(int rentalCostPerDay) {
		this.rentalCostPerDay = rentalCostPerDay;
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
	
	// getTotalRentalDays
	public int getTotalRentalDays() {
		return this.totalRentalDays;
	}
	
	// getRentalCostPerDay
	public int getRentalCostPerDay() {
		return this.rentalCostPerDay;
	}
	
	// OTHER METHODS
	//______________________________________________________________________	
	// toString
	@Override
	public String toString() {
		return
				"Register Number: " + String.valueOf(this.getRegisterNumber()) + "\n" +
				"Owner: " + this.getOwner().toString() + "\n" +
				"Days Rented: " + String.valueOf(this.getTotalRentalDays()) + "\n" +
				"Rent Per Day: " + String.valueOf(this.getRentalCostPerDay()) + "\n";
	}
	
	
	// rentalItem
	public void rentalItem(int moreRentalDays) {
		this.totalRentalDays += moreRentalDays - 1;
	}
}
