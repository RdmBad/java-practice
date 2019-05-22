package A_HomeWork;

import java.util.*;

public class carInsurance {
	public static void main(String[] args) {

		// DO NOT CHANGE
		double premium = 0;
		int accidentsAmount = 0;
		int daysDrivenToWorkOrSchool = 0;
		int milesToWorkOrSchool = 0;
		String vehicleOwnership = "";
		String vehicleUsage = "";
		String continuousInsurance = "";
		String education = "";
		String name = "";
		String referenceNumber = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		// WRITE YOUR CODE HERE
		int age = 0;
		int realExp = 0;
		int exp = 0;
		String anyAccid = "";
		System.out.println("Enter your name");
		name = scan.nextLine();
		System.out.println("Do you have a US driver license?");
		String driverLicense = scan.next();
		if (driverLicense.equalsIgnoreCase("yes")) {
			System.out.println("Enter your zip code");
			int zipCode = scan.nextInt();
			if (zipCode == 20910 || zipCode == 20740) {
				premium += 60;
			} else if (zipCode == 22102 || zipCode == 22103) {
				premium += 30;
			} else {
				premium += 50;
			}
			System.out.println("Is this vehicle Owned, Financed, or Leased?");
			vehicleOwnership = scan.next();
			if (vehicleOwnership.equalsIgnoreCase("owned")) {
				premium += 10;
			} else {
				premium += 20;
			}
			System.out.println("How is this vehicle primarily used?");
			vehicleUsage = scan.next();
			if (vehicleUsage.equalsIgnoreCase("business")) {
				premium += 50;
			} else if (vehicleUsage.equalsIgnoreCase("pleasure")) {
				premium += 10;
			} else if (vehicleUsage.equalsIgnoreCase("commute")) {
				premium += 20;
				System.out.println("Days Driven To Work And/Or School");
				daysDrivenToWorkOrSchool = scan.nextInt();
				premium += daysDrivenToWorkOrSchool * 5;
				System.out.println("Miles Driven To Work And/Or School");
				milesToWorkOrSchool = scan.nextInt();
				premium += milesToWorkOrSchool * 1;
			}
			System.out.println("How old are you?");
			age = scan.nextInt();
			if (age < 16) {
				System.out.println("Invalid data!");
				System.exit(0);
			} else if (age >= 16 && age < 18) {
				premium *= 20;
			} else if (age >= 18 && age <= 21) {
				premium *= 6;
			} else if (age > 21 && age < 25) {
				premium *= 2;
			}
			System.out.println("How many years you've been driving?");
			exp = scan.nextInt();
			realExp = age - exp;
			if (exp > 0 && realExp >= 16) {
				premium -= exp * 5;
			} else {
				System.out.println("Invalid data!");
				System.exit(0);
			}
			System.out.println("Have you had any accidents in the last 5 years?");
			anyAccid = scan.next();
			if (anyAccid.equalsIgnoreCase("yes")) {
				System.out.println("How many?");
				accidentsAmount = scan.nextInt();
				premium += (premium * 0.2) * accidentsAmount;
			}
			System.out.println("Have you had continuous insurance for the past 12 months?");
			continuousInsurance = scan.next();
			if (continuousInsurance.equalsIgnoreCase("no")) {
				premium = premium * 2;
			}

			System.out.println("What is the highest level of education you have completed?");
			education = scan.nextLine();

			if (education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("masters")
					|| education.equalsIgnoreCase("bachelors")) {
				premium = premium - (premium * 0.05);
			} else if (education.equalsIgnoreCase("doctors")) {
				premium = premium - (premium * 0.1);
			} else if (education.equalsIgnoreCase("less than high school")) {
				premium = premium + (premium * 0.05);
			}
			System.out.println(name + ", here's your quote!");
			System.out.println("Start Your Policy Today For: $" + premium);
			referenceNumber = name.substring(0, 2).toUpperCase() + age + name.substring(name.length() - 2).toUpperCase()
					+ zipCode + education.toUpperCase().replace(" ", "");
			System.out.println("Reference number: " + referenceNumber);
		} else {
			System.out.println("Invalid data!");
			System.exit(0);
		}
	}

}
