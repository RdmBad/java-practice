package A_HomeWork;

import java.util.*;

public class ass114 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
				input.nextInt(), input.nextInt() };

		// TODO: write your code below
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			count = 0;
			for (int q = 0; q < nums.length; q++) {
				if (nums[i] == nums[q]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(nums[i]);
				return;
			}
		}

	}
}
