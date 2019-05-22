package day24_arrays1;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce, TESLA

		// 1) create an array of strings, and store these cars inside that array
		// 2) Print car names that starts with M

		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "TESLA" };

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].startsWith("M")) {
				System.out.println(cars[i]);
			}
		}
		// 3) Print all cars that have letter 'r' somewhere in the name
		// please make your search case insensitive
		System.out.println("*************");
		for (String c : cars) {
			if (c.toLowerCase().contains("r")) {
				System.out.println(c);
			}
		}
		// 4) Print car names that ends with 'a'
		System.out.println("**************");

		for (String end : cars) {
			if (!end.endsWith("a")) {
				continue;
			}
			System.out.println(end);
		}

		System.out.println("****************");
		// 5) Print all cars that have at least 6 letters in the name

		for (int i = 0; i < cars.length; i++) {
			if (cars[i].length() >= 6) {
				System.out.println(cars[i]);
			}
		}
		System.out.println("******************");
		// 6) Print Swap first and last value in the array
		// first value cars[i], last value: cars[cars.length-1]
		// create a temp variable, that will get a value of first
		String temp = cars[0];
		// we swap values of first and last element
		cars[0] = cars[cars.length-1];
		// since temp variable has value of first element of array,
		// we assign this value to the last element in the array
		cars[cars.length-1] = temp;
		System.out.println(Arrays.toString(cars));
		Arrays.sort(cars);								// SORT by alphabet
		System.out.println(Arrays.toString(cars));
	}
}
