package assignment2;


//IMPORTS
// ArrayList
import java.util.List;
import java.util.ArrayList;
// readInputPropertyFile
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
// printAllProperties
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
// giveRentalProperty
import javax.swing.*;


public class BnbRentalManager {
	
	
	// OBJECT DATA FIELDS
	// ArrayLists
	private List<BnbApartment> apartmentList;
	private List<BnbHouse> houseList;
	private List<BnbVilla> villaList;
	private List<BnbCar> carList;
	private List<BnbTruck> truckList;
	// FileName
	private String propertyInputFileName = "src/assignment2/InputProperty.txt";
	private String propertyOutputFileName = "src/assignment2/OutputProperty.txt";
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// empty constructor
	public BnbRentalManager() {
		this.apartmentList = new ArrayList<BnbApartment>();
		this.houseList  = new ArrayList<BnbHouse>();
		this.villaList = new ArrayList<BnbVilla>();
		this.carList = new ArrayList<BnbCar>();
		this.truckList = new ArrayList<BnbTruck>();
		this.propertyInputFileName = propertyInputFileName;
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
	
	// getCarList
	public List<BnbCar> getCarList() {
		return this.carList;
	}
	
	//getTruckList
	public List<BnbTruck> getTruckList() {
		return this.truckList;
	}
	
	//getpropertyInputFileName
	public String getpropertyInputFileName() {
		return this.propertyInputFileName;
	}
	
	
	// READ INPUT PROPERTY FILE
	//______________________________________________________________________
	// readInputPropertyFile
	public void readInputPropertyFile() throws IOException {
		
		// readInputPropertyFile
		try {
			
			// get set up
			File sourceFile = new File(this.propertyInputFileName);
			BufferedReader sourceLines = new BufferedReader(new FileReader(sourceFile));
			String propertyDescription = "";
			
			// read all the lines and take appropriate action
			while ((propertyDescription = sourceLines.readLine()) != null) {
				
				// create a propertyArray by splitting on white spaces
				String[] propertyArray = propertyDescription.split("\\s+");
				
				// create ExtractProperty object
				ExtractProperty possibleProperty = new ExtractProperty(propertyArray);
				
				// if it's a valid entry, then populate the appropriate object and add it to an appropriate arrayList
				if (possibleProperty.validEntry()) {
					
					// update possibleProperty to allow us to generate the appropriate object for an ArrayList
					possibleProperty.update();
					
					// establish the propertyType
					int propertyType = possibleProperty.getPropertyType();
					
					// add to the appropriate ArrayList
					if (propertyType == 1) {
						// create the BnbApartment object
						BnbApartment myApartment = possibleProperty.createApartment();
						// add myApartment to the appropriate ArrayList
						apartmentList.add(myApartment);
					} else if (propertyType == 2) {
						// create the BnbHouse object
						BnbHouse myHouse = possibleProperty.createHouse();
						// add myHouse to the approporiate ArrayList
						houseList.add(myHouse);
					} else {
						// create the BnbVilla object
						BnbVilla myVilla = possibleProperty.createVilla();
						// add myVilla to the appropriate ArrayList
						villaList.add(myVilla);	
					}
					
				}
				
			}
		
		// readInputPropertyFile
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	// PRINT ALL PROPERTIES
	//______________________________________________________________________
	public void printAllProperties() throws IOException {
		
		// create a string ArrayList
		List<String> stringOutputs = new ArrayList<String>();
		// populate with Apartment Strings
		stringOutputs.add("APARTMENTS");
		stringOutputs.add("______________________________________________________________________");
		stringOutputs.add("");
		for (int i = 0; i < apartmentList.size(); i++) {
			stringOutputs.add(apartmentList.get(i).toString());
		}
		// populate with House Strings
		stringOutputs.add("HOUSES");
		stringOutputs.add("______________________________________________________________________");
		stringOutputs.add("");
		for (int i = 0; i < houseList.size(); i++) {
			stringOutputs.add(houseList.get(i).toString());
		}
		// populate with Villa Strings
		stringOutputs.add("VILLAS");
		stringOutputs.add("______________________________________________________________________");
		stringOutputs.add("");
		for (int i = 0; i < villaList.size(); i++) {
			stringOutputs.add(villaList.get(i).toString());
		}

		Path file = Paths.get(propertyOutputFileName);
		try {
			Files.write(file, stringOutputs, Charset.forName("UTF-8"));
		} catch (IOException e){
			e.printStackTrace();
		}
		
		
	}
	
	
	// GIVE RENTAL PROPERTY
	// ______________________________________________________________________
	// newRentalTransaction()
	public void newRentalTransaction(int propertyID, int moreRentalDays) {

		// check if valid propertyID
		if (propertyID > 0 && propertyID < BnbProperty.getUniqueRegisterNumber() + 1) {
			// apartment
			for (int i = 0; i < apartmentList.size(); i++) {
				if (apartmentList.get(i).getRegisterNumber() == propertyID) {
					apartmentList.get(i).rentalItem(moreRentalDays);
					return;
				}
			}
			// house
			for (int i = 0; i < houseList.size(); i++) {
				if (houseList.get(i).getRegisterNumber() == propertyID) {
					houseList.get(i).rentalItem(moreRentalDays);
					return;
				}
			}
			// villa
			for (int i = 0; i < villaList.size(); i++) {
				if (villaList.get(i).getRegisterNumber() == propertyID) {
					villaList.get(i).rentalItem(moreRentalDays);
					return;
				}
			}

		}
	}
	
	
	// giveRentalProperty
	public void giveRentalProperty() {
		// user input
		String propertyIDString = JOptionPane.showInputDialog("Enter the Register Number of the property");
		String moreRentalDaysString = JOptionPane.showInputDialog("Enter the days involved in the rental transaction");
		
		// convert to integers
		int propertyID = Integer.parseInt(propertyIDString);
		int moreRentalDays = Integer.parseInt(moreRentalDaysString);
		
		// check if the propertyID is valid
		if (propertyID > 0 && propertyID < BnbProperty.getUniqueRegisterNumber() + 1) {
			this.newRentalTransaction(propertyID, moreRentalDays);
			JOptionPane.showMessageDialog(null, "Your entries have been processed.");
		} else {
			JOptionPane.showMessageDialog(null, "It seems you did not enter a valid property ID.");
		}
		
	}
	
	
	
	
}
