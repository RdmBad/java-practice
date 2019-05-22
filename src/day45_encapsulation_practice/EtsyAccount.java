package day45_encapsulation_practice;

import java.util.*;

public class EtsyAccount {

	private String email;
	private String firstName;
	private String password;

	// constructor 1. No-args. set all as empty string;
	public EtsyAccount() {
		System.out.println("No-Args constructor");
		email = "";
		firstName = "";
		password = "";
	}

	// constructro 2. // takes 3 Args nad set them to instance variable using
	// setters
	public EtsyAccount(String email, String firstName, String password) {
		System.out.println("3 Arg constructor");
		setEmail(email);
		setFirstName(firstName);
		setPassword(password);
	}

	// Constructor 3
	// Email, firstName --> call setter method
	// password is auto generated and ASSIGN

	public EtsyAccount(String email, String firstName) {
		setEmail(email);
		setFirstName(firstName);
		this.password = getRandomPassword();// RANDOM password, 6 characters
	}

	private String getRandomPassword() {
		Random rand = new Random();
		String letters = "abcdefghikjlmnopqrstuwxyz0123456789";
		String rdPassword = "";
		for (int i = 1; i <= 6; i++) {
			rdPassword += letters.charAt(rand.nextInt(letters.length()));
		}
		return rdPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		// if it contains @ somewhere in t he middle, assign it
		if (email.indexOf("@") > 0 && email.indexOf('@') < email.length() - 1) {
			this.email = email;
		} else {
			System.out.println("Please enter a valid email address");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	private boolean isValidFirstName(String firstName) {
		// valid - > all letters, can have space in middle
		// invalid --> cannot contain numbers or any chars
		if (firstName.startsWith(" ") && firstName.endsWith(" ")) {
			return false;
		}
		if (firstName.isBlank()) {
			System.out.println("Can't be blank");
			return false;
		}

		for (int i = 0; i < firstName.length(); i++) {
			char ch = firstName.charAt(i);
			if (!Character.isAlphabetic(ch) && ch != ' ') {
				return false;
			}
		}
		return true;
	}

	public void setFirstName(String firstName) {
		if (isValidFirstName(firstName)) {
			this.firstName = firstName;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() < 6) {
			System.out.println("Must be at least 6 characters.");
		} else {
			this.password = password;
		}
	}

	public String toString() {
		return "EtsyAccaunt [email=" + email + ", firstName=" + firstName + ", password=" + password + "]";
	}

}
