package PointOfSale;

public class PointOfSale {

	public static void main(String[] args) {
		// THIS IS THE MAIN OF THE PROJECT, IT WILL TRIGGER EVERYTHING
		
		System.out.println("Welcome to the Point-Of-Sale Registration System\n");
		
		Login login = new Login();
		login.loginUser();
		
		Item shirt = new Item(4444, "Small, purple and gray raglan.", 49.95);
		System.out.println(shirt.getItemUPC());
		System.out.println(shirt.getItemDesc());
		System.out.println(shirt.getItemPrice());
		
		
		
	}

}
