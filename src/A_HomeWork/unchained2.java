package A_HomeWork;

import java.util.*;

public class unchained2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String word1 = word.toUpperCase();
	    
	    if(word1.charAt(0)=='X'		&& word1.charAt(word.length()-1)=='X'				) {
	    	
	    	System.out.println(word.substring(1,word.length()-1));
	    	
	    }else if(word1.charAt(0)=='X'		&& word1.charAt(word.length()-1)!='X'				) {
	    	
	    	System.out.println(word.substring(1));
	    	
	    }else if(word1.charAt(0)!='X'		&& word1.charAt(word.length()-1)=='X'				) {
    	
    	System.out.println(word.substring(0,word.length()-1));
    	
    } else
    	System.out.println(word);
    
    
	  }
}


System.out.println("Please enter guest name:");
String firstguest = input.next();
String name = input.next();
String list = "";
list = firstguest;
boolean answer;
System.out.println("Do you want to enter new guest name:");
while (answer == true) {
  list += name;
  System.out.println("Please enter guest name:");

}
System.out.println("Guest's list: " + name);


