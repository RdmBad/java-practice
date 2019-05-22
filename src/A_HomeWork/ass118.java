package A_HomeWork;

import java.util.*;

public class ass118 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

		// TODO: write your code below
		for(int i = 0; i < nums.length; i++) {
		int temp = nums[i];
		nums[i] = nums[nums.length-1];
		nums[nums.length-1] = temp;
		}
		// Do not change below statement:
		System.out.println(Arrays.toString(nums));

	}
}
