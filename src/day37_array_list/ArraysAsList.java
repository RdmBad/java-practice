package day37_array_list;

import java.util.*;

public class ArraysAsList {
	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>();
		List<String> cars = Arrays.asList("Tesla", "UAZ", "Porsche", "Audi", "ZAZ");

		List<Integer> nums1 = Arrays.asList(4, 1, 23, 5, 6);

		System.out.println(nums1.size());
		System.out.println(nums1.toString());
		// nums1.add(100); YOU CANNOT ADD BECAUSE SIZE IS FIXED!!!!!!!!!!!
		System.out.println(nums1.toString());

		List<Double> prices = Arrays.asList(5.99, 8.99, 6.99, 123.56, 33.12, 200.1, 12.99, 55.99, 88.99, 899.99);
		// calculate sum of all prices
		double sum = 0;

		for (double price : prices) {
			sum += price;
		}
		System.out.println("Sum:  " + sum);

		double sum2 = 0;

		for (int i = 0; i < prices.size(); i++) {
			sum2 += prices.get(i);
		}
		System.out.println("Sum2: " + sum2);

		// create new List expensive
		// add prices that are more than 100

		List<Double> expensive = new ArrayList<>();
		for (int i = 0; i < prices.size(); i++) {
			if (prices.get(i) > 100) {
				expensive.add(prices.get(i));
			}
		}

		System.out.println("List of prices that more than 100: " + expensive.toString());
		prices.removeAll(expensive);
		System.out.println("After removing expensive things: " + prices.toString());
	}
}
