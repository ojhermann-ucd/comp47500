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
	// empty constructor
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
	
	// getCarList
	public List<BnbCar> getCarList() {
		return this.carList;
	}
	
	//getTruckList
	public List<BnbTruck> getTruckList() {
		return this.truckList;
	}
	
	
}
