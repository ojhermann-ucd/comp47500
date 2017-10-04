package assignment1;


// IMPORTS
import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class BnbApartment extends BnbProperty {
	
	
	// CLASS DATA FIELDS
	//______________________________________________________________________
	static List<BnbApartment> apartmentList = new ArrayList<BnbApartment>();
	
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int stories;
	private int beds;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbApartment(String name, String address, int rate, int days, int stories, int beds) {
		super(name, address, rate, days);
		this.stories = stories;
		this.beds = beds;
		apartmentList.add(this);
	}
	
	// empty constructor
	public BnbApartment() {
		super();
		this.stories = 0;
		this.beds = 0;
		apartmentList.add(this);
	}
	
	
	// SETTER METHODS
	//______________________________________________________________________
	// stories
	public void setStories(int stories) {
		this.stories = stories;
	}
	
	// beds
	public void setBeds(int beds) {
		this.beds = beds;
	}
	
	
	// GETTER METHODS
	//______________________________________________________________________
	// stories
	public int getStories() {
		return stories;
	}
	
	// beds
	public int getBeds() {
		return beds;
	}
	
	
	// OTHER METHODS
	//______________________________________________________________________
	// fillInProperties
	public void fillInProperties() {
		
		// data field
		Random rn = new Random();
		
		// iterate over the apartmentList
		for (int i = 0; i < apartmentList.size(); i++) {
			// use rentProperty three times with random rentalDays values between 0 and 14
			apartmentList.get(i).rentProperty(rn.nextInt(15));
			apartmentList.get(i).rentProperty(rn.nextInt(15));
			apartmentList.get(i).rentProperty(rn.nextInt(15));
		}
	}
	
		
}
