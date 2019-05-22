package day31_method03;

import java.util.Arrays;

public class MethodsWithStrings {
	public static void main(String[] args) {
		countWords("dsf sdf sdf sdf sdf sdf dgf");
		googleSearchResult("About 121,000,000 results (0.75 seconds");
	}

	public static void countWords(String sentence) {

		String[] words = sentence.split(" ");
		System.out.println("Words in this sentence " + Arrays.toString(words));
		System.out.println("Number of words: " + words.length);
	}

//About 121,000,000 results (0.75 seconds)
	public static void googleSearchResult(String result) {
		String[] array = result.split(" ");
		System.out.println(Arrays.toString(array));
		String count = array[1];
		String time = array[3];

		System.out.println("Results count: " + count.replace(",", ""));
		System.out.println("Time in seconds: " + time.substring(1));
	}

}
