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
	
	
	// OTHER METHODS
	//______________________________________________________________________
	// fillInProperties
	public void fillInProperties() {
		
		// data field
		Random rn = new Random();
		
		// iterate over the villaList
		for (int i = 0; i < villaList.size(); i++) {
			villaList.get(i).rentProperty(rn.nextInt(15));
			villaList.get(i).rentProperty(rn.nextInt(15));
			villaList.get(i).rentProperty(rn.nextInt(15));
		}
	}
	
	
}
