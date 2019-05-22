package day14_string_methods;

public class CharAt {
	public static void main(String[] args) {
		String word = "Computer";
		System.out.println(word.length());
		//print first character one by one
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));   StringIndexOutOfBound ERROR if more then real index
	
		//String word2 and check if first character is 'J'
		String word2 = "Java";
		if(word2.charAt(0) == 'J') {
			System.out.println("J is first character");
		}else {
			System.out.println("J is not a first char");
		}
	//String word3 that consists of 5 characters
		//Check if first and last characters are same,
		// true ==> "First and last match
		//false ==> "First and last are different

		String word3 = "COLBA";
		if(word3.charAt(0) == word3.charAt(4)) {
			System.out.println("first nad last same");
		}else {
			System.out.println("first and last are not same");
		}
	
		//String word4 => 
		//no matter the length
		String word4 = "a;sflkj;sdagjbna;dlkgja;djnfa;kdjfbladfja;osgn;aod00";
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println("Last value of " + word4 + " is " + lastChar);
	}
}
