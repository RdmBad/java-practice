package A_HomeWork;

import java.util.*;

public class ass98 {
	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
				String json = scan.nextLine();
			  String[] sentence = json.split(", ");
			  String firstName = sentence[1].substring(14, sentence[1].length()-1);
			  String lastName =  sentence[2].substring(13, sentence[2].length()-1);
			  System.out.println("First name: " + firstName);
			  System.out.println("Last name: " + lastName);
			    
			  }

}
