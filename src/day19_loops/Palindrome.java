package day19_loops;
import java.util.*;
public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test");
		String word = scan.next();
		String reversed = "";
		//loop through word in reverse order and concetanate each character to reversed string
		
		

		int idx = word.length()-1;
		while(idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
		}
	System.out.println(reversed);
	
	//compare if word and reversed are equal
	
	if(reversed.equalsIgnoreCase(word)) {
		System.out.println("It is palindrome");
	}else {
		System.out.println("It is not a palindrome");
	}
	}
	}
	