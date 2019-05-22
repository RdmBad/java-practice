package A_HomeWork;

import java.util.*;

public class ass104 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };

		// TODO Type your code below:
		int count = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 5) {
				if (nums[i + 1] == 5) {
					count++;
				}
			}
		}
		if (count > 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
