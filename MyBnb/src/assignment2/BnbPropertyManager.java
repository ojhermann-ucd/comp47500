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


public class BnbPropertyManager {
	
	
	// OBJECT DATA FIELDS
	private List<BnbApartment> apartmentList;
	private List<BnbHouse> houseList;
	private List<BnbVilla> villaList;
	private List<BnbCar> carList;
	private List<BnbTruck> truckList;
	
	
	// CONSTRUCTORS
	//______________________________________________________________________
	// empyty constructor
	public BnbPropertyManager() {
		this.apartmentList = new ArrayList<BnbApartment>();
		this.houseList  = new ArrayList<BnbHouse>();
		this.villaList = new ArrayList<BnbVilla>();
	}
	
	
	
}
