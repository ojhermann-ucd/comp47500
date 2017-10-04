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
	
	
	// OTHER METHODS
	//______________________________________________________________________
	// fillInProperties
	public void fillInProperties() {
		
		// data field
		Random rn = new Random();
		
		// iterate over the houseList
		for (int i = 0; i < houseList.size(); i++) {
			houseList.get(i).rentProperty(rn.nextInt(15));
			houseList.get(i).rentProperty(rn.nextInt(15));
			houseList.get(i).rentProperty(rn.nextInt(15));
		}
	}
	
	
}
