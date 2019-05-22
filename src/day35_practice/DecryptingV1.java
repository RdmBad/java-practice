package day35_practice;

public class DecryptingV1 {
	public static void main(String[] args) {
		System.out.println(decryptChar('q'));
		System.out.println(decryptChar('z'));
		System.out.println(decryptWord("hxsllo"));

		String crypted = "hgfwvmgh";
		String decrypted = decryptWord(crypted);
		System.out.println("crypted is - " + crypted + "\ndecrypted is - " + decrypted);

		String sentence = "nb mznv rh lotz";
		System.out.println(decryptSentence(sentence));
	}

	public static char decryptChar(char ch) {
		String decrypted = "abcdefghijklmnopqrstuvwxyz";
		String alphabet = "zyxwvutsrqponmlkjihgfedcba";
		int i = decrypted.indexOf(ch);
		char ret = alphabet.charAt(i);
		return ret;
	}

	public static String decryptWord(String word) {
		String cyphered = "";
		for (int i = 0; i < word.length(); i++) {
			cyphered += decryptChar(word.charAt(i));
		}
		return cyphered;
	}

	public static String decryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for (String word : wordsArr) {
			retValue += decryptWord(word) + " ";
		}
		return retValue.trim();
	}
}
