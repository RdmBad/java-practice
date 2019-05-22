package day14_string_methods;
import java.util.*;
public class LengthTask {
	public static void main(String[] args) {
		Scanner words = new Scanner(System.in);
		
		System.out.println("Enter first word:");
		String word1 = words.next();
		System.out.println("Enter second word:");
		String word2 = words.next();
		if(word1.length() > word2.length()) {
			System.out.println(word1 + " is longer");
		}else if (word1.length() == word2.length()) {
			System.out.println(word2 + " and " + word1 + " are equal");
		}else {
			System.out.println(word2 + " is longer");
		}
	}
}
