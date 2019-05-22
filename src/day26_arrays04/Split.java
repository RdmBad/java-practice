package day26_arrays04;

import java.util.*;

public class Split {
	public static void main(String[] args) {

		String words = "java,kava,html,selenium";
		String[] myWordsArray = words.split(",");
		System.out.println(myWordsArray.length);
		System.out.println(Arrays.toString(myWordsArray));

		for (String word : myWordsArray) {
			System.out.println(word);
		}
		String diceResult = "1 - 20 of 1,461 positions";
		String[] diceArray = diceResult.split(" ");
		System.out.println(diceArray.length);
		System.out.println(Arrays.toString(diceArray));
		String digit = "";

		for (int i = 0; i < diceArray.length; i++) {
			if (diceArray[i].equals("1,461")) {
				System.out.println(diceArray[i]);
			}
		}
		String[] diceArray2 = diceResult.split("of");
		System.out.println(diceArray2.length);
		System.out.println(diceArray2[0].trim());
		System.out.println(diceArray2[1]);

		String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";

		String[] allWords = sentence.split(" ");
		String[] iSplit = sentence.split("I");
		String[] happySplit = sentence.split(" happy");

		System.out.println(allWords.length);
		System.out.println(iSplit.length);
		System.out.println(happySplit.length);

		System.out.println(Arrays.toString(allWords));
		System.out.println(Arrays.toString(iSplit));
		System.out.println(Arrays.toString(happySplit));

		for (String w : allWords) {
			System.out.println(w);
		}
		System.out.println("SPLIT BY HAPPY");

		for (String w : happySplit) {
			System.out.println(w);
		}

		System.out.println("SPLIT BY I");

		for (String w : iSplit) {
			System.out.println(w);
		}

		String word = "java";
		char[] charsArray = word.toCharArray();
		System.out.println(Arrays.toString(charsArray));
		
	}
}
