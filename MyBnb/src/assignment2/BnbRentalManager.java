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


public class BnbRentalManager {
	
	
	// OBJECT DATA FIELDS
	private List<BnbApartment> apartmentList;
	private List<BnbHouse> houseList;
	private List<BnbVilla> villaList;
	private List<BnbCar> carList;
	private List<BnbTruck> truckList;
	private String fileName = "src/assignment2/InputProperty.txt";
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// empty constructor
	public BnbRentalManager() {
		this.apartmentList = new ArrayList<BnbApartment>();
		this.houseList  = new ArrayList<BnbHouse>();
		this.villaList = new ArrayList<BnbVilla>();
		this.carList = new ArrayList<BnbCar>();
		this.truckList = new ArrayList<BnbTruck>();
		this.fileName = fileName;
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
	
	//getFileName
	public String getFileName() {
		return this.fileName;
	}
	
	
	// READ INPUT PROPERTY FILE
	//______________________________________________________________________
	// readInputPropertyFile
	public void readInputPropertyFile() throws IOException {
		
		// readInputPropertyFile
		try {
			
			// get set up
			File sourceFile = new File(this.fileName);
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
	
	
}
