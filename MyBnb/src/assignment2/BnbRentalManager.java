package assignment2;


//IMPORTS
// ArrayList
import java.util.List;
import java.util.Random;
import java.util.ArrayList;
// readInputPropertyFile
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
// printAllProperties
//import java.io.FileWriter;
//import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;


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
	
	
	// FIND PROPERTY BY ID
	// findPropertyLocation
	public int[] findPropertyLocation(int possibleRegisterNumber) {
		
		// data field
		int[] myArray = new int[2]; // first entry is property type, second is index in relevant array
		
		for (int i = 0; i < apartmentList.size(); i++) {
			if (apartmentList.get(i).getRegisterNumber() == possibleRegisterNumber) {
				myArray[0] = 1;
				myArray[1] = i;
				return myArray;
			}
		} // end for
		for (int i = 0; i < houseList.size(); i++) {
			if (houseList.get(i).getRegisterNumber() == possibleRegisterNumber) {
				myArray[0] = 2;
				myArray[1] = i;
				return myArray;
			}
		} // end for
		for (int i = 0; i < villaList.size(); i++) {
			if (villaList.get(i).getRegisterNumber() == possibleRegisterNumber) {
				myArray[0] = 3;
				myArray[1] = i;
				return myArray;
			}
		} // end for
			// make the function happy i.e. it doesn't know the condition
		return myArray;
	}
	
	// find
	
	
}
