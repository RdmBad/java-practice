package day22_loops_practice2;

public class FindHowManyUsingReplace {
	public static void main(String[] args) {
		String word = "including webpages, images";
		//find how many 'i' characters in the word
		//get the length of word
		//replace all e with empty
		//get the length of word again without 'e'
		//do a minus
		int length1 = word.length();
		word = word.replace("i", "");
		int length2 = word.length();
		System.out.println("Length1 is:" + length1);
		System.out.println("Length2 is:" + length2);
		int count = length1 - length2;
		System.out.println("Count is: " + count);
	}
}
