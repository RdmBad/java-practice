package day34_methods06;

import java.util.*;

public class CountArray {
	public static void main(String[] args) {
		int[] nums = { 2, 3, 4, 5, 6, 5, 6, 4, 4, 4, 123, 112, 223 };
		// 1. with Print return right away
		System.out.println(findOccurences(nums, 5));
		System.out.println(findOccurences(nums, 4));
		// 2. assign return value into a variable
		int five = findOccurences(nums, 5);
		System.out.println("5 values: " + five);
		if (five > 0) {
			System.out.println("We have 5s");
		} else {
			System.out.println("No 5s");
		}
		if (findOccurences(nums, 2) > 0) {
			System.out.println("We have 2s");
		} else {
			System.out.println("No 2s");
		}

		// 3.

		int twenty = findOccurences(new int[] { 10, 20, 20, 123, 32, 45 }, 20);
		System.out.println("Twenty: " + twenty);
	}

// class CountArray
	public static int findOccurences(int[] array, int value) {
		int count = 0;
		for (int num : array) {
			if (num == value) {
				count++;
			}
		}
		return count;
	}

	public static int[] getArray() {
		int[] num1 = { 43, 10, 20, 20, 30 };
		return num1;
	}

	public static int[] getRandomArray(int size) {

		Random rand = new Random();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = rand.nextInt(101);
		}
		return nums;
	}
}
