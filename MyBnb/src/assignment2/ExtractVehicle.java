package assignment2;

public class ExtractVehicle {
	
	
	// OBJECT DATA FIELDS
	// ______________________________________________________________________
	// from vehicle
	private int registerNumber;
	private String owner;
	private int daysRented;
	private int rentPerDay;
	private int vehicleType;
	// from car
	private int passengerNumbers;
	// from truck
	private int cargoWeight;
	// general
	private String[] inputArray;
	
	
	// CONSTRUCTORS
	// ______________________________________________________________________
	// specified constructor
	public ExtractVehicle(String[] vehicleArray) {
		this.owner = null;
		this.daysRented = 0;
		this.rentPerDay = 0;
		this.vehicleType = 0;
		this.passengerNumbers = 0;
		this.cargoWeight = 0;
		this.inputArray = vehicleArray;
	}
	
	
	// VALIDATION
	// ______________________________________________________________________
	// checkInt()
	public boolean checkInt(String possibleIntString) {

		// exception handling
		try {

			// convert string to integer
			int propertyType = Integer.parseInt(possibleIntString);
			return true;

		} catch (NumberFormatException e) {
			// we only care that it is not an appropriate value; we're not asked
			// to correct the document or notify the user
			return false;
		}

	}
	
	// validFirstEntry()
	public boolean validFirstEntry() throws NumberFormatException {

		// data field
		String stringInt = this.inputArray[0];

		// check if it's an integer
		if (this.checkInt(stringInt)) {

			// generate the integer
			int typeOfProperty = Integer.parseInt(stringInt);

			// check if the integer is valid
			if (typeOfProperty > 0 && typeOfProperty < 4) {
				// in acceptable range
				return true;
			} else {
				// outside of acceptable range
				return false;
			}

			// not an integer
		} else {
			return false;
		}

	}
	
	// validEntry()
	public boolean validEntry() {
		// make sure has a valid first entry
		if (this.validFirstEntry()) {

			// data fields
			String stringInt = this.inputArray[0];
			int typeOfVehicle = Integer.parseInt(stringInt);

			// check 1 & 2
			if (typeOfVehicle == 1 || typeOfVehicle == 2) {
				for (int i = 0; i < 5; i++) {
					// make sure the first five entries are int
					if (!this.checkInt(this.inputArray[i])) {
						return false;
					}
				}
				// return true if the first five are int; the remaining entries
				// are strings, but we don't have conditions to test on those
				return true;
			// the only remaining possibility is a type 3 property
			} else {
				for (int i = 0; i < 6; i++) {
					if (!this.checkInt(this.inputArray[i])) {
						return false;
					}
				}
				// return true if the first six are int
				return true;
			}

		}

		// not a valid first entry
		return false;
	}
	

}
