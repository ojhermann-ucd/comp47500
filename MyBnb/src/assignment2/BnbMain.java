package assignment2;

// IMPORTS
import java.io.IOException;

public class BnbMain {

	public static void main(String[] args) throws IOException {
		
		// make the object
		BnbRentalManager myRentalManager = new BnbRentalManager();
		
		// properties
		myRentalManager.readInputPropertyFile();
		myRentalManager.giveRentalProperty();
		myRentalManager.printAllProperties();
		
		// vehicles
		myRentalManager.readInputVehicleFile();
		myRentalManager.fillInVehicles();
		myRentalManager.printAllVehicles();

	}

}
