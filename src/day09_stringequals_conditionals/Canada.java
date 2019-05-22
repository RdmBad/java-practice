package day09_stringequals_conditionals;
import java.util.*;
public class Canada {
public static void main(String[] args) {
	System.out.println("What is the capital of Canada?");
	Scanner keyboard = new Scanner(System.in);
	
	String capital = keyboard.nextLine();
	
	//check if the answer is correct.
	if(capital.equals("Ottawa")) {     // if(capital.equalsIgnoreCase("Ottawa"))      IGNORE CASE WORD
		System.out.println("Your answer is correct");
	} else {
		System.out.println("Your answer is incorrect! " + capital + " is not a capital of Canada");
	}

	
	
	
	
	
}
}
