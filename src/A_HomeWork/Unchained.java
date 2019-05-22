package A_HomeWork;

import java.util.*;

public class Unchained {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		char first = word.charAt(0);
		char last = word.charAt(word.length() - 1);

		if (first == 'x' && last == 'X') {

			System.out.println(word.substring(1, word.length()-1));
			
		} else if (first == 'X' && last == 'x') {

			System.out.println(word.substring(1, word.length()-1));
			
		} else if (first == 'X') {
			System.out.println(word.substring(1));
		} else if (last == 'X') {
			System.out.println(word.substring(0, word.length()-1));
		} else if (first == 'x') {
			System.out.println(word.substring(1));
		} else if (last == 'x') {
			System.out.println(word.substring(0, word.length()-1));
		} else {
			System.out.println(word);
		}
	}

}
