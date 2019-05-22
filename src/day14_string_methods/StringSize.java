package day14_string_methods;
import java.util.*;
public class StringSize {
	public static void main(String[] args) {
		String str1 = "Good morning";
		// check if it matches "Good Morning" and print match of not match
		
		if(str1.equals("Good Morning")) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		
		if(str1.equalsIgnoreCase("good morning")) {
			System.out.println("Match - ignore case");
		}else {
			System.out.println("Not Match - ignore case");
		}
		//convert to ALL uppercase and print
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1); // it stays as old value. not uppercase
		str1 = str1.toUpperCase();
		System.out.println("After assignment: " + str1);
		
		//combine the above methods together
		//convert to lowercase first then check if it equals("good morning")
		
		if(str1.toLowerCase().equals("good morning")) {
			System.out.println("Chained methods: match");
		}else {
			System.out.println("Chained methods: do not match");
		}
		
		//FIND OUT HOW MANY CHARAACTERS IN THE STRING
		
		String myName = "Erdem";
		System.out.println(myName.length());
		
		int length = myName.length();
		System.out.println("My name's length: " + length);
		
		//usernames must be exactly 8 characters.
		String userName = "Erdembad";
		if (userName.length() == 8) {
			System.out.println("Valid user name");
		}else {
			System.out.println("user name is not equal 8 characters");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter password:");
		String password = scan.next();
		if(password.length() >= 6) {
			System.out.println("password is good");
		}else {
			System.out.println("BADD PASSWORD");
		}
		
		int passwordLength = password.length();
		if(passwordLength < 6) {
			System.out.println("Invalid password. too short");
		}else {
			System.out.println("Valid password. good job");
		}
	}
}
