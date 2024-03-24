package myJewelryStoreProject;

public class Bracelet extends Inventory{
	
	int quantity;
	
	public Bracelet(int id, String name, String type, int price, int size, int quantity){
		this.id=id;
		this.name=name;
		this.type=type;
		this.price=price;
		this.size=size;
		this.quantity=quantity;

}

}
