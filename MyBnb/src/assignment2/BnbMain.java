package assignment2;

// IMPORTS
import java.io.IOException;

public class BnbMain {

	public static void main(String[] args) throws IOException {
		
		BnbRentalManager myRentalManager = new BnbRentalManager();
		myRentalManager.readInputPropertyFile();
		myRentalManager.giveRentalProperty();
		myRentalManager.printAllProperties();
		myRentalManager.readInputVehicleFile();
		myRentalManager.fillInVehicles();
		myRentalManager.printAllVehicles();

	}

}
