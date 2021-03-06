package assignment2;

public class BnbCar extends BnbVehicle {

	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int passengerNumbers;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbCar(String owner, int totalRentalDays, int rentalCostPerDay, int passengerNumbers) {
		super(owner, totalRentalDays, rentalCostPerDay);
		this.passengerNumbers = passengerNumbers;
	}
	
	// empty constructor
	public BnbCar() {
		super();
		this.passengerNumbers = 0;
	}
	
	
	// SETTER METHODS
	//______________________________________________________________________
	// passengerNumbers
	public void setPassengerNumbers(int passengerNumbers) {
		this.passengerNumbers = passengerNumbers;
	}
	
	
	// GETTER METHODS
	//______________________________________________________________________
	// passengerNumbers
	public int getPassengerNumbers() {
		return this.passengerNumbers;
	}

	
	// OTHER METHODS
	//______________________________________________________________________
	// toString
	@Override
	public String toString() {
		return
				"Vehicle Type: Car" + "\n" +
				"Vehicle Type: " + String.valueOf(this.getVehicleType()) + "\n" +
				super.toString() +
				"Number of Passengers: " + String.valueOf(this.getPassengerNumbers()) + "\n" +
				"Income: " + String.valueOf(this.income()) + "\n";
	}
	
	// income()
	public int income() {
		// income = days x rate
		return this.getdaysRented() * this.getrentPerDay();
	}
	
	
}
