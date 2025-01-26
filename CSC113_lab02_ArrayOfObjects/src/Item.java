
public class Item {
	
	private int id; 
	private String name;
	private double price;
	
	public Item(int id, String name,double price) {
		this.id = id;
		this.name = name; 
		this.price = price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "Item ID: " + this.id + ", Name: " + this.name + ", Price: " + this.price + " SAR";
	}
	
}