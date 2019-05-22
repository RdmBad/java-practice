package A_HomeWork;

import java.util.Arrays;

public class ass138_zombie_attack2 {
	public static void main(String[] args) {
		int[] in = { 3, 6, 0, 4, 3, 2, 7, 7 };
		// 0 1 2 3 4 5 6 7
		int idx = 0;
		System.out.println("Day 0" + Arrays.toString(in));

		for (int i = 0; i < in.length; i++) {
			if (in[i] == 0) {
				for (int j = 0; j < in.length; j++) {
					if (in[j] == 0) {
						if (j == 0) {
							in[j + 1] = in[j + 1];
						} else if (j == 7) {
							in[j - 1] = in[j - 1];
						} else {
							in[j + 1] = in[j + 1];
							in[j - 1] = in[j - 1];
						}
					}
				}
			i--;
			}
			
			System.out.println("Day " + i + Arrays.toString(in));
		}

		// for (int i = 0; i < in.length; i++) {
//			for (int j = 0; j < in.length; j++) {
//				if (in[i] == 0) {
//					idx = i;
//				} else {
//					break;
//				}
//			}
//
//			if (idx == 0) {
//				in[idx + 1] = in[idx + 1] / 2;
//			} else if (idx == 7) {
//				in[idx - 1] = in[idx - 1] / 2;
//			} else {
//				in[idx + 1] = in[idx + 1] / 2;
//				in[idx - 1] = in[idx - 1] / 2;
//			}
//
//			System.out.println("Day 1" + Arrays.toString(in));
//		}

	}
}
