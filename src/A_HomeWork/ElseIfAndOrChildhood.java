package A_HomeWork;
import java.util.*;
public class ElseIfAndOrChildhood {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    //WRITE YOUR CODE HERE 
	    int age;
	    age = scan.nextInt();
	    System.out.println("Display promt. Enter age:");
	    
	    if (age < 2) {
	    	System.out.println("Display promt: ineligible");
	    } else if (age == 2) {
	    	System.out.println("Display promt: toddler");
		    } else if (age >=3 && age <=5) {
		    	System.out.println("Display promt: early childhood");
		 		} else if (age == 6 && age == 7) {
		 		    	System.out.println("Display promt:  young reader");
		 		    } else if (age >= 8  && age <= 10) {
		 		    	System.out.println("Display promt: elementary");
		 		    } else if (age == 11 && age == 12) {
		 		    	System.out.println("Display promt: middle");
		 		    } else if (age == 13) {
		 		    	System.out.println("Display promt: impossible");
		 		    } else if (age >=14 && age <= 16) {
		 		    	System.out.println("Display promt: high school"); 
		 		    } else if (age == 17 && age == 18) {
		 		    	System.out.println("Display promt: schoolar");
		 		    }else if (age > 18) {
		 		    	System.out.println("Display promt: ineligible");
		 		    }
	}
}




