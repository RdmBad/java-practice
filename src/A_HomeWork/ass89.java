package A_HomeWork;

import java.util.*;

public class ass89 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();

		while (count > 0) {
			System.out.print(word);
			if (count > 1) {
				System.out.print(separator);
			}
			count--;
		}

	}
}
