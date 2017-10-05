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
	public BnbApartment(String postalAddress, String ownersName, int rentPerDay, int daysRented, int stories, int beds) {
		super(postalAddress, ownersName, rentPerDay, daysRented);
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
	
	// getApartmentList
	public List<BnbApartment> getApartmentList() {
		return apartmentList;
	}
	
	
	// OTHER METHODS
	//______________________________________________________________________	
	// toString
	@Override
	public String toString() {
		return
				"Property Type: Apartment" + "\n"
				+ super.toString() + "\n"
				+ "Stories: " + String.valueOf(this.getStories()) + "\n"
				+ "Beds: " + String.valueOf(this.getBeds()) + "\n"
				+ "Income: " + String.valueOf(this.income()) + "\n";
	}
	
	// income()
	public int income() {
		// income = day x rent x stories x beds
		return (this.getDaysRented() * this.getRentPerDay()) * this.getStories() * this.getBeds();
	}
	
		
}
