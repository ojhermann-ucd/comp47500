package assignment1;


//IMPORTS
import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class BnbVilla extends BnbProperty {
	
	
	// CLASS DATA FIELDS
	//______________________________________________________________________
	static List<BnbVilla> villaList = new ArrayList<BnbVilla>();
	
	
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
		villaList.add(this);
	}
	
	// empty constructor
	public BnbVilla() {
		super();
		this.dailyRoomService = 0;
		this.dailyLuxuryTax = 0;
		villaList.add(this);
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
	
	// getVillaList
	public List<BnbVilla> getVillaList() {
		return villaList;
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
				"Daily Luxury Tax: " + String.valueOf(this.getDailyLuxuryTax()) + "\n";
	}
	
	
}
