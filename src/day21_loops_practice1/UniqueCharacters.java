package day21_loops_practice1;
import java.util.*;
public class UniqueCharacters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1) Given a String word , print unique characters from the word;
		/*
		 * Examples: word = Wooden Spoon
		 * 					woden sp
		 *           word = "java"
		 *           		 jav
		*/
	String word = "javva";
	String unique = "";
	
	char ch = word.charAt(0);
	
	System.out.println(unique.contains(""+ch));
	if(!unique.contains(""+ch)) {
		unique += ch;  // unique = unique + ch;
	}
	System.out.println("Unique:" + unique);
	//______________________________________________________________________________________
	
	if(unique.indexOf(ch) == -1) {
		unique += ch;	
	System.out.println("Unique" + unique);
	}
	
	String word2 = "bananas";
	String unique2 = "";
	
	int i = 0;
	char ch2 = word2.charAt(i);
	System.out.println("Ch2: " + ch2);
	
	//check if ch2 is in the unique2 variable
	if(unique2.contains(ch2))					
		
		//HOW TO CONVERT CHAR INTO STRING: char 
		//1)  char ch = 'b';
		//String = ""+ch; // attach to empty string
		
		//2) 
		
	
	}
}
