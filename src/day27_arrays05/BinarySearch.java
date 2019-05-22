package day27_arrays05;

import java.util.*;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = { 4, 6, 7, 10, 55 };
		System.out.println(Arrays.binarySearch(nums, 7));
		System.out.println(Arrays.binarySearch(nums, 55));
		System.out.println(Arrays.binarySearch(nums, 2));

		int i = Arrays.binarySearch(nums, 10);
		System.out.println(i);

		int[] nums2 = { 4, 54, 6, 7, 33, 10, 5, 55 };

		System.out.println(Arrays.binarySearch(nums2, 33));
	}
}
