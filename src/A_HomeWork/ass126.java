package A_HomeWork;

import java.util.*;

public class ass126 {

	public static void main(String[] args) {

		int[] outer = { 1, 2, 3, 4, 5 };
		int[] inner = { 1, 6};

		// WRITE YOUR CODE HERE
		int count = 0;
		int temp = 0;
		for (int i = 0; i < outer.length; i++) {
			count = 0;
			for (int j = 0; j < inner.length; j++) {
				if (outer[i] == inner[j]) {
					count++;
				}
			}
			if (count > 0)
				temp++;
		}
		// if (outer.length < inner.length) {
		// if (temp == outer.length) {
		// System.out.println(true);
		// } else {
		// System.out.println(false);
		// }
//		} else if (outer.length > inner.length) {
		if (temp == inner.length) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
