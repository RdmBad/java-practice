package day32_method04;

import java.util.Arrays;

public class ArrayParameters {
	public static void main(String[] args) {
	int[] myArray = {44, 22, 66 ,11};
		printArray(myArray);
		printArray(new int[] {33, 45, 5 ,7});
		int[] myNums = new int[] {3,4,5,6,345,34,31, 43, 23};
		printArray(myNums);
	
	print2Arrays(myArray, myNums);
	print2ArraysV2(myArray, myNums);
	
	}

	public static void printArray(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

/*
 	Method name: print2Arrays
 	return: void
 	params: 2 int[]
 	it prints the larger Array followed by smaller array
 */
public static void print2Arrays(int[] nums1, int[] nums2) {
	 if(nums1.length > nums2.length) {
		 System.out.println(Arrays.toString(nums1));
		 System.out.println(Arrays.toString(nums2));
	} else {
		 System.out.println(Arrays.toString(nums2));
		 System.out.println(Arrays.toString(nums1));
			
	}
}

public static void print2ArraysV2(int[] nums1, int[] nums2) {
	 if(nums1.length > nums2.length) {
		 printArray(nums1);
		 printArray(nums2);
	 } else {
		 printArray(nums2);
		 printArray(nums1);
			
	}
}
}
