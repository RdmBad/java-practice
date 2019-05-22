package A_HomeWork;

import java.util.*;

public class ass115 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for (int i = 0; i < 5; i++) {

			words[i] = input.nextLine();

		}

		// write your code below
		String temp = "";
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[j].length() > words[i].length()) {
					temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
			System.out.println(words[0]);
			return;
		}
		
	}
}
