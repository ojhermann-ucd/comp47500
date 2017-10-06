package assignment2;

public class ExtractProperty {

	// OBJECT DATA FIELDS
	// ______________________________________________________________________
	// from property
	private String postalAddress;
	private String ownersName;
	private int rentPerDay;
	private int daysRented;
	// from apartment
	private int stories;
	private int beds;
	// from house
	private int clearingFees;
	// from villa
	private int dailyRoomService;
	private int dailyLuxuryTax;
	// general
	private int propertyType;
	private String[] inputArray;

	// CONSTRUCTORS
	// ______________________________________________________________________
	// specified constructor
	public ExtractProperty(String[] propertyArray) {
		this.postalAddress = null;
		this.ownersName = null;
		this.rentPerDay = 0;
		this.daysRented = 0;
		this.stories = 0;
		this.beds = 0;
		this.clearingFees = 0;
		this.dailyRoomService = 0;
		this.dailyLuxuryTax = 0;
		this.propertyType = 0;
		this.inputArray = propertyArray;
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
			int typeOfProperty = Integer.parseInt(stringInt);

			// check 1 & 2
			if (typeOfProperty == 1 || typeOfProperty == 2) {
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
