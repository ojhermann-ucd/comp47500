package assignment1;


//IMPORTS
import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class BnbPropertyManager {
	
	
	// OBJECT DATA FIELDS
	private List<BnbApartment> apartmentList;
	private List<BnbHouse> houseList;
	private List<BnbVilla> villaList;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// constructor
	public BnbPropertyManager() {
		this.apartmentList = new ArrayList<BnbApartment>();
		this.houseList  = new ArrayList<BnbHouse>();
		this.villaList = new ArrayList<BnbVilla>();
	}
	
	
	// GETTER METHODS
	//______________________________________________________________________
	// getApartmentList
	public List<BnbApartment> getApartmentList() {
		return this.apartmentList;
	}
	
	// getHouseList
	public List<BnbHouse> getHouseList() {
		return this.houseList;
	}
	
	// getVillaList
	public List<BnbVilla> getVillaList() {
		return this.villaList;
	}
	
	
	// FILL IN PROPERTIES
	//______________________________________________________________________
	// apartments
	public void populateApartments() {
		
		// random number: rn
		Random rn = new Random();
		
		// create three BnbApartment objects with random inputs
		for (int i = 0; i < 3; i++) {
			// generate the inputs
			String address = "aptAddress " + String.valueOf(i);
			String owner = "aptName " + String.valueOf(i);
			int days = rn.nextInt(10) + 1;
			int rent = rn.nextInt(91) + 10;
			int stories = rn.nextInt(10) + 1;
			int beds = (rn.nextInt(2) + 1) * stories;
			// create the object
			apartmentList.add(new BnbApartment(address, owner, days, rent, stories, beds));
		}
		
		// iterate over items in apartmentList
		for (int i = 0; i < apartmentList.size(); i++) {
			// call rentProperty three times for each property and increase a random number of days from 1 to 14
			for (int j = 0; j < 3; j++) {
				apartmentList.get(i).rentProperty(rn.nextInt(14) + 1);
			}
			
		}
		
	}
	
	// house
	public void populateHouse() {
		
		// random number: rn
		Random rn = new Random();
		
		// create three BnbHouse objects with random inputs
		for (int i = 0; i < 3; i++) {
			// generate the inputs
			String address = "houseAddress " + String.valueOf(i);
			String owner = "houseName " + String.valueOf(i);
			int days = rn.nextInt(10) + 1;
			int rent = rn.nextInt(91) + 10;
			int stories = rn.nextInt(10) + 1;
			int fees = rn.nextInt(20) + 1;
			// create the object
			houseList.add(new BnbHouse(address, owner, days, rent, stories, fees));
		}
		
		// iterate over items in houseList
		for (int i = 0; i < houseList.size(); i++) {
			// call rentProperty three times for each property and increase a random number of days from 1 to 14
			for (int j = 0; j < 3; j++) {
				houseList.get(i).rentProperty(rn.nextInt(14) + 1);
			}
			
		}
		
	}

	
	// villa
	public void populateVilla() {
		
		// random number: rn
		Random rn = new Random();
		
		// create three BnbVilla objects with random inputs
		for (int i = 0; i < 3; i++) {
			// generate the inputs
			String address = "villaAddress " + String.valueOf(i);
			String owner = "villaName " + String.valueOf(i);
			int days = rn.nextInt(10) + 1;
			int rent = rn.nextInt(91) + 10;
			int service = rn.nextInt(10) + 1;
			int tax = rn.nextInt(20) + 1;
			// create the object
			villaList.add(new BnbVilla(address, owner, days, rent, service, tax));
		}
		
		// iterate over items in houseList
		for (int i = 0; i < villaList.size(); i++) {
			// call rentProperty three times for each property and increase a random number of days from 1 to 14
			for (int j = 0; j < 3; j++) {
				villaList.get(i).rentProperty(rn.nextInt(14) + 1);
			}
			
		}
		
	}
	
	
	// fillInProperties
	public void fillInProperties() {
		this.populateApartments();
		this.populateHouse();
		this.populateVilla();
	}
	
	
	// PRINT ALL PROPERTIES
	//______________________________________________________________________
	public void printAllProperties() {
		// apartments
		System.out.println("APARTMENTS");
		System.out.println("______________________________________________________________________");
		System.out.println("");
		for (int i = 0; i < apartmentList.size(); i++) {
			System.out.println(apartmentList.get(i).toString());
		}
		// houses
		System.out.println("HOUSES");
		System.out.println("______________________________________________________________________");
		System.out.println("");
		for (int i = 0; i < houseList.size(); i++) {
			System.out.println(houseList.get(i).toString());
		}
		// villas
		System.out.println("VILLAS");
		System.out.println("______________________________________________________________________");
		System.out.println("");
		for (int i = 0; i < villaList.size(); i++) {
			System.out.println(villaList.get(i).toString());
		}
	}
	
	
	// TOTAL INCOME
	//______________________________________________________________________
	// totalIncome()
	public int calculateTotalIncome() {
		
		// object data field
		int income = 0;
		
		// apartment
		for (int i = 0; i < apartmentList.size(); i++) {
			income += apartmentList.get(i).income();
		}
		
		// house
		for (int i = 0; i < houseList.size(); i++) {
			income += houseList.get(i).income();
		}
		
		// villa
		for (int i = 0; i < villaList.size(); i++) {
			income += villaList.get(i).income();
		}
		
		// return
		return income;
				
	}
		
		
}
