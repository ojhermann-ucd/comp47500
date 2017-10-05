package assignment2;

public class BnbVilla extends BnbProperty {
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int dailyRoomService;
	private int dailyLuxuryTax;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbVilla(String postalAddress, String ownersName, int rentPerDay, int daysRented, int dailyRoomService, int dailyLuxuryTax) {
		super(postalAddress, ownersName, rentPerDay, daysRented);
		this.dailyRoomService = dailyRoomService;
		this.dailyLuxuryTax = dailyLuxuryTax;
	}
	
	// empty constructor
	public BnbVilla() {
		super();
		this.dailyRoomService = 0;
		this.dailyLuxuryTax = 0;
	}
	
	
	// SETTER METHODS
	//______________________________________________________________________
	// dailyRoomService
	public void setDailyRoomService(int dailyRoomService) {
		this.dailyRoomService = dailyRoomService;
	}
	
	// dailyLuxuryTax
	public void setDailyLuxuryTax(int dailyLuxuryTax) {
		this.dailyLuxuryTax = dailyLuxuryTax;
	}
	
	
	// GETTER METHODS
	//______________________________________________________________________
	// dailyRoomService
	public int getDailyRoomService() {
		return dailyRoomService;
	}
	
	// dailyLuxuryTax
	public int getDailyLuxuryTax() {
		return dailyLuxuryTax;
	}
	
	
	// OTHER METHODS
	//______________________________________________________________________
	// toString
	@Override
	public String toString() {
		return
				"Property Type: Villa" + "\n" +
				super.toString() +
				"Daily Room Service Fee: " + String.valueOf(this.getDailyRoomService()) + "\n" +
				"Daily Luxury Tax: " + String.valueOf(this.getDailyLuxuryTax()) + "\n" +
				"Income: " + String.valueOf(this.income()) + "\n";
	}
	
	// income()
	public int income() {
		// income = days x (rent + fee - tax)
		return this.getDaysRented() * (this.getRentPerDay() + this.getDailyRoomService() - this.getDailyLuxuryTax());
	}
	

}
