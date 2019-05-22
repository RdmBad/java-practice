package AdditionalOfficeHours;

import java.util.Arrays;

public class RemoveFromArray {
	public static void main(String[] args) {
		int[] nums = { 1, 3, 1, 4, 1, 6 };
		System.out.println(Arrays.toString(removeFromArray(nums, 6)));
		
		int target = 1; // need to remove all 1s from nums
		// find out how many targets are in nums
		int count = 0;
		// loop and using if condition, increase counter for each match
		for (int n : nums) {
			if (n == target) {
				count++;
			}
		}
		System.out.println(count);
		// declare new array empty with size that does not include target count
		int[] newArray = new int[nums.length - count];
		// loop nums one more time and add all values that are not target.
		int idx = 0;
		for (int n : nums) {
			if (n != target) {
				newArray[idx] = n;
				idx++;
			}
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(newArray));
	}

	public static int[] removeFromArray(int[] arr, int target) {
		int count = 0;
		for (int n : arr) {
			if (n == target) {
				count++;
			}
		}
		int[] newArray = new int[arr.length - count];
		int idx = 0;
		for (int n : arr) {
			if (n != target) {
				newArray[idx] = n;
				idx++;
			}
		}
		return newArray;

	}
}
