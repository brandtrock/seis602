package PointOfSale;

/*
 * TODO: Implement BigDecimal() for price 
 */

public class Item {
	
	private int upc;
	private String desc;
	private double price;
	
	public Item (int itemUPC, String itemDescription, double itemPrice) {
		upc = itemUPC;
		desc = itemDescription;
		price = itemPrice;
	}
	
	public int getItemUPC() {
		return upc;
	}
	
	public void setItemUPC(int itemUPC) {
		upc = itemUPC;
	}
	
	public String getItemDesc() {
		return desc;
	}
	
	public void setItemDesc(String itemDescription){
		desc = itemDescription;
	}
	
	public double getItemPrice() {
		return price;
	}
	
	public void setItemPrice(double itemPrice) {
		price = itemPrice;
	}
	
}
