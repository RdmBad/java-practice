package day11_logical_nestedif;
import java.util.*;
public class LogInTests {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter user name:");
		String username = scan.next();
		System.out.println("Enter password:");
		String password = scan.next();
		
		String validUserName = "cybertek@mail.com";
		String validPassword = "WoodenSpoon123";
		
		
		if (username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
			System.out.println("Login Successful, Welcome!");
		} else if (!username.equalsIgnoreCase(validUserName) && !password.equals(validPassword))   { 
			System.out.println("Invalid Username nad Invalid Password");
		} else if (username.equalsIgnoreCase(validUserName) && !password.equals(validPassword)) {
			System.out.println("Invalid Password");
		} else if (!username.equalsIgnoreCase(validUserName) && password.equals(validPassword)) {
			System.out.println("Invalid Username");
		}
	
	} 
}
