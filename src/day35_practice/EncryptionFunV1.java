package day35_practice;

public class EncryptionFunV1 {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";

		String word = "civic";
		/*
		 * "e" --> "v" "a" --> "z" "s" --> "h" "t" --> "g" "e" --> "v" "r" --> "i"
		 */
		// get a char from word
		// find indexOf the char in alphabet
		// read the char from encrypted at that index
		// add to some string
		char letter = word.charAt(0);
		int position = alphabet.indexOf(letter);
		char enChar = encrypted.charAt(position);
		String secret = "";
		System.out.println(letter + "  -->  " + enChar);

		for (int i = 0; i < word.length(); i++) {
			letter = word.charAt(i);
			position = alphabet.indexOf(letter);
			enChar = encrypted.charAt(position);
			secret += enChar + "";
		}
		System.out.println("Secret word is: " + secret);

	}
}
