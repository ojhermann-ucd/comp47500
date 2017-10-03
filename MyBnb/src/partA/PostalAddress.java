package partA;

public class PostalAddress {
	
	// data fields
	private String street;
	private String city;
	private String country;
	
	// constructor
	public PostalAddress(String street, String city, String country) {
		this.street = street;
		this.city = city;
		this.country = country;
	}
	
	// toString()
	@Override
	public String toString() {
		return street + ", " + city + ", " + country;
	}

}
