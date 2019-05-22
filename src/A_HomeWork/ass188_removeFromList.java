package A_HomeWork;

import java.util.*;

public class ass188_removeFromList {
	public static void main(String[] args) {

		ArrayList<String> str = new ArrayList<>();
		str.add("a");
		str.add("b");
		str.add("c");
		str.add("a");
		str.add("a");
		str.add("a");

		removeAll(str, "a");


	}

	public static void removeAll(ArrayList<String> wordList, String targetWord) {
		for (int i = 0; i < wordList.size(); i++) {
			if (wordList.get(i).equals(targetWord)) {
				wordList.remove(i--);				// -- because all indexes moves to the left after remove
			}
		}
		System.out.println(wordList);
	}
}
