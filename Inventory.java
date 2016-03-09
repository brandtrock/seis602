package PointOfSale;

public class Inventory {

	private int upc; // TODO: This value will come from Item
	private int quantity; // This is the quantity of a specific item in stock
	private int threshold; // Each item will have a threshold number, a constant should be used.
	private Boolean orderPlaced; // If TRUE, the item is the process of being re-stocked.
	
	// If orderPlaced is FALSE and the threshold has been met (or exceeded) OR quanity is zero, then trigger this method
	public void reorderItem() {}
}
