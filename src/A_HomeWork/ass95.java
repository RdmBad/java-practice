package A_HomeWork;

import java.util.*;

public class ass95 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		int count = 0;
		String temp = "";
		for (int i = 0; i < str.length() - 4; i++) {
			temp = str.substring(i, i + 5);
			if (temp.equals("bread")) {
				count++;
			}

		}
		if (count >= 2) {
			System.out.println(str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
		} else {
			System.out.println("nothing");
		}

	}

}
