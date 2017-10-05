package assignment2;

public class BnbHouse extends BnbProperty{
	
	
	// OBJECT DATA FIELDS
	//______________________________________________________________________
	private int stories;
	private int clearingFees;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// specified constructor
	public BnbHouse (String postalAddress, String ownersName, int rentPerDay, int daysRented, int stories, int clearingFees) {
		super(postalAddress, ownersName, rentPerDay, daysRented);
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
	
	
	// OTHER METHODS
	//______________________________________________________________________	
	// toString
	@Override
	public String toString() {
		return
				"Property Type: House" + "\n" +
				super.toString() +
				"Stories: " + String.valueOf(this.getStories()) + "\n" +
				"Clearing Fees: " + String.valueOf(this.getClearingFees()) + "\n" +
				"Income: " + String.valueOf(this.income()) + "\n";
	}
	
	// income()
	public int income() {
		// income = days x stories x (rent + fees)
		return this.getDaysRented() * this.getStories() * (this.getRentPerDay() + this.getClearingFees());
	}


}
