package A_HomeWork;

import java.util.*;

public class ass195_throughtArray_ANAGRAM {
	public static void main(String[] args) {

		String word1 = "listen";
		String word2 = "silent";

		
StringBuilder sb = new StringBuilder(word1);
System.out.println(sb.reverse());

		word1 = word1.replace(" ", "").toLowerCase();
		word2 = word2.replace(" ", "").toLowerCase();
		

		char[] word1Arr = word1.toCharArray();
		char[] word2Arr = word2.toCharArray();

		Arrays.sort(word1Arr);
		Arrays.sort(word2Arr);

		System.out.println(Arrays.toString(word1Arr));
		System.out.println(Arrays.toString(word2Arr));
		
		if(Arrays.equals(word1Arr, word2Arr)) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}