package ro.unitbv.javadatatype;

public class Adress {

	private String street;
	private String city;
	private int number;

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public int getNumber() {
		return number;
	}

	public Adress(String city, String street, int number) {
		this.city = city;
		this.street = street;
		this.number = number;

	}

	public String getCompleteAdress() {
		return city + street + number;
	}

}