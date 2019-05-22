package day23_arrays;
import java.util.*;
public class ConcatWordWithoutJava {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String word = "";
	String sentence = "";
	;
	for (int i = 1; i <= 6; i++) {
		System.out.println("Enter word");
		word = scan.next();
		if(word.equals("java")) {
			continue;
		}
		sentence += word + ", ";
	}
	System.out.println("Total sum of concat words is: " + sentence.substring(0, sentence.length()-2));	


}
}
