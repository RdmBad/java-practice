package day46_static_keyword;

public class Vehicle {
	String type; // instance variable, every object has its own type
	static int numberOfVehicles; // shared, one central value

	public static void vehicleInfo() {
		// System.out.println("type: " + type); < will not compile. tupe is non static
		System.out.println("NumbersOfVehicles: " + numberOfVehicles);
		int count = getNumberOfVehicles();
		String make = "kia";
		make = make.toUpperCase();
		System.out.println("make: " + make);
	}

	public static int getNumberOfVehicles() {
		return numberOfVehicles;
	}

	public String toString() {
		return "Vehicle type: " + type + " | count: " + numberOfVehicles;
	}


}
