package A_HomeWork;

import java.util.Arrays;

public class ass138_zombie_attack2 {
	public static void main(String[] args) {
		int[] in = { 9, 1, 0, 4, 3, 2, 0, 7 };
		// 0 1 2 3 4 5 6 7

		int day = 1;
		System.out.println("Day 0" + Arrays.toString(in));

		for (int i = 0; i < in.length; i++) {
			while (in[i] == 0) {
				for (int j = 0; j < in.length; j++) {
					if (in[j] == 0) {
						if (j == 0) {
							in[j + 1] = in[j + 1] / 2;
						} else if (j == 7) {
							in[j - 1] = in[j - 1] / 2;
						} else {
							in[j + 1] = in[j + 1] / 2;
							in[j - 1] = in[j - 1] / 2;
						}
					}

				}
				System.out.println("Day " + day + Arrays.toString(in));
				day++;
				i--;
			}
		}

	}
}
