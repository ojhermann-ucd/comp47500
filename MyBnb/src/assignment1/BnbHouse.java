package assignment1;


//IMPORTS
import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class BnbHouse extends BnbProperty {
	
	
	// CLASS DATA FIELDS
	//______________________________________________________________________
	static List<BnbHouse> houseList = new ArrayList<BnbHouse>();
	
	
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
		houseList.add(this);
	}
	
	// empty constructor
	public BnbHouse() {
		super();
		this.stories = 0;
		this.clearingFees = 0;
		houseList.add(this);
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
	
	// getHouseList
		public List<BnbHouse> getHouseList() {
			return houseList;
		}
	
	
	// OTHER METHODS
	//______________________________________________________________________	
	// toString
	@Override
	public String toString() {
		return
				"Stories: " + String.valueOf(this.getStories()) + "\n" +
				"Clearing Fees: " + String.valueOf(this.getClearingFees()) + "\n" + 
				super.toString();
	}
	
	
}
