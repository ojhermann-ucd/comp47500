package assignment1;

public class BnbMain {

	public static void main(String[] args) {
		// create a new property manager
		BnbPropertyManager myPropertyManager = new BnbPropertyManager();
		
		// fill in properties
		myPropertyManager.fillInProperties();
		
		// print all properties
		myPropertyManager.printAllProperties();
		
		// calculate total income
		int myIncome = myPropertyManager.calculateTotalIncome();
		String myIncomeString = "Total Income: " + String.valueOf(myIncome);
		System.out.println("______________________________________________________________________");
		System.out.println("");
		System.out.println(myIncomeString);
	}

}
