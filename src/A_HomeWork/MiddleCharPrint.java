package A_HomeWork;
import java.util.*;
public class MiddleCharPrint {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter word:");
	    String word = scan.next();
	    //YOUR CODE HERE
 	   
	    if(word.length()%2!=0) {
	    }else if (word.length() >= 3) {
	      System.out.println(word.charAt(word.length()/2));
	    }else if (word.length() == 1) {
	      System.out.println(word+word+word);
	    return;
	    }
}
}
