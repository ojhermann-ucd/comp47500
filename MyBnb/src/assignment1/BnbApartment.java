package assignment1;

public class BnbApartment extends BnbProperty {
	
	
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
	}
	
	// empty constructor
	public BnbApartment() {
		super();
		this.stories = 0;
		this.beds = 0;
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
}