package A_HomeWork;

import java.util.*;

public class ass105v2 {
	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
		// String[] words = { input.nextLine(), input.nextLine(), input.nextLine(),
		// input.nextLine(), input.nextLine() };
		String[] words = { "hello", "by", "red", "blue", "sdfslf" };
		// TODO: Write your code below
		for(int i = 0; i < words.length; i++) {
			words[i] = words[i].charAt(0) + "" + words[i].charAt(words[i].length()-1);
		}
		System.out.println(Arrays.toString(words));
	}
}
