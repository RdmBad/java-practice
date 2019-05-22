package day36_wrapperclasses_arraylistintro;

import java.util.ArrayList;

public class ArrayListIntro {
	public static void main(String[] args) {
		// create an ArrayList

		ArrayList<String> names = new ArrayList<>();

		int[] numsArray = new int[5];
		ArrayList<Integer> nums = new ArrayList<>();

		// assign values into arraylist
		names.add("Roman");
		names.add("Erdem");
		names.add("Vlad");

		nums.add(345345);
		nums.add(100);

		// read from ArrayList
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(nums.get(1));

		// get number of elements/values
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
	}
}
