package A_HomeWork;

import java.util.*;

public class ass99 {
	public static void main(String[] args) {
		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (i = 1; i <= n; i++) {
			for (j = 1; j > n + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
