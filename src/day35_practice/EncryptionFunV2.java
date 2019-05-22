package day35_practice;

import java.util.Arrays;

public class EncryptionFunV2 {
	public static void main(String[] args) {
		System.out.println(encryptChar('g'));
		System.out.println(encryptChar('z'));
		System.out.println(encryptWord("javaisfun"));

		String normal = "sunday";
		String encrypted = encryptWord(normal);
		System.out.println("normal is - " + normal + "\nencrypted is - " + encrypted);

		String sentence = "my name is olga";
		System.out.println(encryptSentence(sentence));
	}

	public static char encryptChar(char ch) {
		String alphabet =  "abcdefghijklmnopqrstuvwxyz";
		String encrypted = "zyxwvutsrqponmlkjihgfedcba";
//		return encrypted.charAt(alphabet.indexOf(ch));
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}

	public static String encryptWord(String word) {
		String cyphered = "";
		for (int i = 0; i < word.length(); i++) {
			cyphered += encryptChar(word.charAt(i));
		}
		return cyphered;
	}

	public static String encryptSentence(String sentence) {
		String[] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for (String word : wordsArr) {
			retValue += encryptWord(word) + " ";
		}
		return retValue.trim();
	}

}
