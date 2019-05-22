package A_HomeWork;

import java.util.*;

public class ass51_tip_calculator {
	public static void main(String[] args) {
		int people = 0;
		String serviceQ = "";
		String split;
		double checkAmount = 0;
		double tip = 0;
		double totalPay = 0;
		double totalTip = 0;
		double totalPerPerson = 0.0;
		double tipPerPerson = 0.0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Split:");
		split = scan.next();
		if (split.equalsIgnoreCase("yes")) {
			System.out.println("Number of people:");
			people = scan.nextInt();
			String totalPeople = "";
			int people1;
			people1 = people;

			while (people > 0) {
				totalPeople += "&";
				people--;
			}
			System.out.println("Check amount:");
			checkAmount = scan.nextDouble();
			System.out.println("Service Quality:");
			serviceQ = scan.next();
			switch (serviceQ) {
			case "Poor":
				tip = 0.05;
				break;
			case "Fair":
				tip = 0.1;
				break;
			case "Good":
				tip = 0.15;
				break;
			case "Great":
				tip = 0.2;
				break;
			case "Excellent":
				tip = 0.25;
				break;
			default:
				System.out.println("Invalid tip");
			}
			totalTip = checkAmount * tip;
			totalPay = checkAmount + totalTip;
			totalPerPerson = totalPay / people1;
			tipPerPerson = totalTip / people1;
			System.out.println("Number of people entered: " + totalPeople);
			System.out.println("Total to pay: " + totalPay);
			System.out.println("Total tip: " + totalTip);
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);
		} else {
			System.out.println("Split:No");
		}
	}
}
