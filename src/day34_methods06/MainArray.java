package day34_methods06;

import java.util.*;

public class MainArray {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(CountArray.getArray()));
		// Store return value into array
		int[] nums = CountArray.getArray();
		System.out.println(Arrays.toString(nums));

//		for (;;) {   // while(true)  ==> both are INFINITE LOOP
			System.out.println(Arrays.toString(CountArray.getRandomArray(10)));
//		}
		
		int[] randomNums = CountArray.getRandomArray(3);
		System.out.println(Arrays.toString(randomNums));
	}
}
