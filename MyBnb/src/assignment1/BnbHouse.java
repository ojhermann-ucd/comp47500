package assignment1;

public class BnbHouse extends BnbProperty {
	
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int stories;
	private int clearingFees;
	
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbHouse(String name, String address, int rate, int days, int stories, int clearingFees) {
		super(name, address, rate, days);
		this.stories = stories;
		this.clearingFees = clearingFees;
	}
	
	// empty constructor
	public BnbHouse() {
		super();
		this.stories = 0;
		this.clearingFees = 0;
	}
	
	
	// SETTER METHODS
	//______________________________________________________________________
	// stories
	public void setStories(int stories) {
		this.stories = stories;
	}
	
	// stories
	public void setClearingFees(int clearingFees) {
		this.clearingFees = clearingFees;
	}

	
	// GETTER METHODS
	//______________________________________________________________________
	// stories
	public int getStories() {
		return stories;
	}
	
	public int getClearingFees() {
		return clearingFees;
	}
	
	
}