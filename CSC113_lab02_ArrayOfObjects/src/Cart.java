
public class Cart {
	
	private Item[] items;
	private  int itemCount;
	
	public Cart(int size) {
		items = new Item[size];
		itemCount = 0;
	}
	
	public boolean addItem(Item it) {
		if (itemCount == items.length)
			return false;
		else {
			items[itemCount++] = it;
			return true;
		}
		
	}
	
	public double getTotal() {
		double total = 0;
		for (int i=0; i<itemCount; i++) {
			total += items[i].getPrice();
		}
		return total;		
	}
	
	public String toString() {
		String text = "Cart (" + itemCount + "):";
		for (int i=0; i<itemCount; i++) {
			text += "\n"+ items[i];				
		}
		text += "\n------------------------------------------";
		return text;
	}
	
}