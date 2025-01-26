
public class Main {

	public static void main(String[] args) {
		
		Cart c = new Cart(20);
		
		Item it1 = new Item(1,"Water", 15.50);
		Item it2 = new Item(5,"Sugar", 19.95);
		Item it3 = new Item(8,"Rice", 40.00);
		
		c.addItem(it1);
		c.addItem(it2);
		c.addItem(it3);
		System.out.println(c);
		System.out.println("Total: " + c.getTotal() + " SAR");
		it3.setPrice(35.00);
		System.out.println(c);
		System.out.println("Total: " + c.getTotal() + " SAR");
		
	}

}
