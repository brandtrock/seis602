package PointOfSale;

import java.util.Date;

public class Sale {
	
	private int orderNumber;
	private Date orderDate  = new Date();
	private int[] orderItemList;
	private double orderTotal;
	
	private int createOrderNumber() {
		// TODO: implement a method to generate a unique order number 
		// Order Number anatomy: STORE ID + MACHINE NUMBER + INCREMENTING NUMBER
		// Example: 33 + 01 + 0001 = 33010001
		// Increment this with each sale
		
		return orderNumber;
	}
	
	public void cancelSale() {
		// TODO: cancel the sale, before triggering the item removal and only write the 
		// order number to the report file with the text CANCELLED
	}
	
	public void finalizeSale() {
		// TODO: finalize sales, trigger item removal from inventory and write to report file
	}
	
	public void returnSale() {
		// TODO: handle return of items.
		// Refund money, return item to inventory
		// Write a new line, versus overwriting the old, with the same order number
		// new machine number and cashier number, add text "RETURNED"
	}
}
