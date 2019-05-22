package A_HomeWork;

import java.util.*;

public class ass120 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = { scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next() };
		String temp = "";
		temp = str[0];

		for (int i = 0; i < str.length; i++) {
			if (temp.length() < str[i].length()) {
				temp = str[i];
			}

		}
		System.out.println(temp);

	}
}
