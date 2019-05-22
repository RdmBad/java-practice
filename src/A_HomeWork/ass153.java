package A_HomeWork;

import java.util.*;

public class ass153 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		String[] words = new String[size];
		for (int i = 0; i < size; i++) {
			words[i] = scan.next();
		}
		printUniqueWords(words);
	}

	// java python sql sql java
	public static void printUniqueWords(String[] words) {
		// WRITE YOUR CODE HERE
		String temp = "";
	
		for (int i = 0; i < words.length; i++) {
			temp = words[i];
			int count = 0;
			for (int j = 0; j < words.length; j++) {
				if (temp.equals(words[j]) && i != j) {
					System.out.println("IT IS EQUAL - " + temp);
					count++;
				}
				
			}
			if (count == 0) {
				System.out.println("UNIQUE - " + temp);
			}
		}
	}
}
