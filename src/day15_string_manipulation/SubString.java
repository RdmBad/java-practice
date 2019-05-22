package day15_string_manipulation;

public class SubString {
	public static void main(String[] args) {
		String sentence = "Java String manipulation is fun!";
		//print Java
		System.out.println(sentence.substring(0,4));
		//print String
		System.out.println(sentence.substring(5,12));
	}
}
