package day08_casting_conditionals;
import java.util.Scanner;
public class VotingEligibility {
	public static void main(String[] args) {
		/*  
		  program to tell if you are eligible to vote
		  votingAge  = 18
		  yourAge  = take from scanner 
		    if you are eligible to vote.
		  	   you are eligible to vote
		  	   you have been eligible for 3 years.
		    else
		       you are not eligible to vote
		       you still have 3 more years to go
		    
		 */
		Scanner scan = new Scanner(System.in);
		int votingAge = 18;
		System.out.println("Enter your age: ");
		int yourAge = scan.nextInt();
		if(yourAge >= votingAge) {
			int years = yourAge - votingAge;
			System.out.println("You are eligible to vote. You have been eligible to vote for "+years+" years");
	
			
		}else {
			System.out.println("You are not eligible to vote. You still have more "+(votingAge - yourAge)+" years to go");
		}
		
	
	
	}
}
