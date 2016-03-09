package PointOfSale;

import java.util.Scanner;

public class Login {

	private String user = "cashier"; // TODO - a data structure for a list of users
	private String username = ""; // To store the user-entered input
	
	private String pwd = "1234"; // TODO - a data structure of associated passwords
	private String password = ""; // To store the user-entered input
	
	private Scanner input = new Scanner(System.in); // Scanner object to read user input
	
	private boolean checkUsername( String username ) {
		
		// Force the string to be lowercase to check the validation
		username = username.toLowerCase();
		
		if ( user.equals(username) ) {
			return true; // the username is valid
		}
		
		return false;
		
	}
	
	private boolean checkPassword( String password ) {
		
		// Password should be case-sensitive, so no toLowerCase() needed
		
		if ( pwd.equals(password) ) {
			return true; // the password is valid
		}
		
		return false;
	}
	
	public void loginUser() {
		
		System.out.print("Please enter your user name (cashier): ");
		username = input.next();
		
		System.out.print("Please enter your password (1234): ");
		password = input.next();
		
		if ( checkUsername(username) && checkPassword(password) ) {
			System.out.println("<LOG> Electronic-Sales Counter is started successfully by user " + username + "!");
		} else {
			System.out.println("<LOG> Non-existent user " + username + ", please enter again!");
			loginUser(); // call this method again
		}

		
	}
	
}
