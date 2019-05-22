package A_HomeWork;

import java.util.*;

public class ass152 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = scan.nextInt();
		}
		printUniqueNumbers(nums);
	}

	public static void printUniqueNumbers(int[] nums) {
		// WRITE YOUR CODE HERE
		int count = 0;
		for (int first = 0; first < nums.length; first++) {
			count = 0;
			for (int second = 0; second < first; second++) {
				if (first == second) {
					count++;
				}
				if (count == 1) {
					System.out.println(second + "Unique number");
				}
			}
		}
		

	}
}
