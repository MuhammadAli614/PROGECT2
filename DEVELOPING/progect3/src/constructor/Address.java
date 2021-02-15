package constructor;

public class Address {
	public String streetAddress;
	public char unit;
	public int zipCode;
	public String city;
	public String state;
	
	//Constructor-1
	public Address() {}
	//Constructor-2
	public Address(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	//Constructor-3
	public Address(String streetAddress, char unit, int zipCode, String city, String state) {
		this.streetAddress = streetAddress;
		this.unit = unit;
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public char getUnit() {
		return unit;
	}

	public void setUnit(char unit) {
		this.unit = unit;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
