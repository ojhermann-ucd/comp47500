package assignment2;

public class BnbTruck extends BnbVehicle {

	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int cargoWeight;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbTruck(String owner, int totalRentalDays, int rentalCostPerDay, int cargoWeight) {
		super(owner, totalRentalDays, rentalCostPerDay);
		this.cargoWeight = cargoWeight;
	}
	
	// empty constructor
	public BnbTruck() {
		super();
		this.cargoWeight = 0;
	}
	
	
	// SETTER METHODS
	//______________________________________________________________________
	// cargoWeight
	public void setcargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}
	
	
	// GETTER METHODS
	//______________________________________________________________________
	// cargoWeight
	public int getcargoWeight() {
		return this.cargoWeight;
	}

	
	// OTHER METHODS
	//______________________________________________________________________
	// toString
	@Override
	public String toString() {
		return
				"Vehicle Type: Car" + "\n" +
				"Vehicle Type: " + String.valueOf(this.getVehicleType()) +
				super.toString() +
				"Cargo Weight: " + String.valueOf(this.getcargoWeight()) + "\n";
	}
	
	// income()
	public int income() {
		// income = days x rate - weight
		return this.getdaysRented() * this.getrentPerDay() - this.cargoWeight;
	}
	
}
