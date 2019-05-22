package day35_practice;

import java.util.*;

public class UniqueNumbersArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		findUnique(scan, nums);

	}

	private static void findUnique(Scanner scan, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i != j) {
					count++;
				}
			}
			if (count < 1) {
				System.out.println("Unique: " + nums[i]);
			}
		}
	}

	// find out how many unique numbers
	// declare new array with that size
	// and loop through again and assign unique numbers
	// return the array
	public static int[] getUnique(int[] nums) {
		Scanner scan = new Scanner(System.in);
		int uniqueCount = 0;
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}

		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i != j) {
					count++;
				}
			}
			if (count < 1) {
				System.out.println("Unique: " + nums[i]);
			}
		}
		int[] uniqueArray = new int[uniqueCount];
		int idx = 0;

		for (int i = 0; i < nums.length; i++) {
			nums[i] = scan.nextInt();
		}

		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j] && i != j) {
					count++;
				}
			}
			if (count < 1) {
				uniqueArray[idx] = nums[i];
				idx++;
			}
		}
	}
}
