package day27_arrays05;

import java.util.*;

public class ArraysClass {
	public static void main(String[] args) {
		int[] nums = { 43, 12, 4, 1, 3, 5 };
		// toString method
		String str = Arrays.toString(nums);
		System.out.println(str);

		// sort method. sorts array in ascending order
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		String[] languages = { "Zulu", "Spanish", "Italian", "English", "Polish", "arabic", "Uzbek" };
		System.out.println(Arrays.toString(languages));
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		// When sorting string values, order will be this way:
		// Numbers > UPPERCASE > lowercase

		int[] nums2 = { 345, 665, 3333, 11, 3, 66 };
		// find lowest and largest values from nums2 Array
		System.out.println(Arrays.toString(nums2));
		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums2));
		int lowest = nums2[0];
		int largest = nums2[nums2.length-1];
		System.out.println("Lowest is - " + lowest);
		System.out.println("Largest is - " + largest);

		// BINARY SEARCH
		
		int nums3[] = {4,10,20,50};
		Arrays.binarySearch(nums, 10);  // ===> 1
		Arrays.binarySearch(nums, 20);  // ===> 2
	}
}
