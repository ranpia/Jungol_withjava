package q508;

public class Item {
	private String item;
	private String count;
	private String price;
	
	public Item(String item, String count, String price){
		this.item=item;
		this.count=count;
		this.price=price;
	}
	
	public String getItem() {
		return this.item;
	}
	public String getPrice() {
		return this.price;
	}
	public String getCount() {
		return this.count;
	}
}
