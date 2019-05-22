package A_HomeWork;

import java.util.*;

public class ass92 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		// long fact = n;
		// while (n > 1) {
		// fact = fact * (n - 1);
		// n--;
		// }
		// System.out.println(fact);

		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
