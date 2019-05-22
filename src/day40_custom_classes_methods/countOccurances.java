package day40_custom_classes_methods;

import java.util.*;

public class countOccurances {
	public static void main(String[] args) {
		ArrayList<String> sentence = new ArrayList<>();
		sentence.add("dog");
		sentence.add("horse");
		sentence.add("duck");
		sentence.add("dog");
		sentence.add("elephant");
		sentence.add("wolf");
		sentence.add("squirell");
		sentence.add("cat");
		String word3 = "dog";

		System.out.println(countOccurances(sentence, word3));
	}

	public static int countOccurances(ArrayList<String> str, String word) {
		String word1 = "";
		int count = 0;
		for (int i = 0; i < str.size(); i++) {
			if (str.get(i).equals(word)) {
				count++;
			}
		}
		return count;
	} 
}

