package A_HomeWork;

import java.util.*;

public class LaptopConfigurator {
	public static void main(String[] args) {
		double price = 0;
		String storageType, screenType, cpu;
		int ram = 0;
		Scanner scan = new Scanner(System.in);
		// WRITE YOUR CODE HERE
		System.out.println("Select screen size:");
		double screenSize = scan.nextDouble();
		if (screenSize == 13.3) {
			price += 200;
		} else if (screenSize == 15) {
			price += 300;
		} else if (screenSize == 17.3) {
			price += 400;
		}

		System.out.println("Select CPU type:");
		cpu = scan.next();
		if (cpu.equals("i3")) {
			price += 150;
		} else if (cpu.equals("i5")) {
			price += 250;
		} else if (cpu.equals("i7")) {
			price += 350;
		}

		System.out.println("Select RAM size:");
		ram = scan.nextInt();
		price += ram / 4 * 50;

		System.out.println("Select storage type:");
		String storage = scan.next();
		System.out.println("Enter memory size:");
		int memorySize = scan.nextInt();

		if (storage.equals("SSD")) {
			price += memorySize / 500 * 100;
		} else if (storage.equals("HDD")) {
			price += memorySize / 500 * 50;
		}

		System.out.println("Enter screen resolution:");
		String screenResolution = scan.next();
		if (screenResolution.equals("FULLHD")) {
			price += 100;
		} else if (screenResolution.equals("4K")) {
			price += 200;
		}

		System.out.println("Laptop price is: $" + price);
	}
}
