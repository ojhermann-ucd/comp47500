package assignment1;

public class BnbVilla extends BnbProperty {
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int dailyRoomService;
	private int dailyLuxuryTax;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbVilla(String name, String address, int rate, int days, int dailyRoomService, int dailyLuxuryTax) {
		super(name, address, rate, days);
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
	
	
}