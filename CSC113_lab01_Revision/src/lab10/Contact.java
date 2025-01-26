package lab10;

public class Contact {
	
	private String name;
	private String number;
	private String email;
	private String address;
	public static int count;
	
	// constructor
	public Contact(String name, String number, String email, String address) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
		count++; // to count number of objects
	}
	
	// setters and getters
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name + " | " + number + " | " + email + " | " + address;
	}
}

