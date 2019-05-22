
package day08_casting_conditionals;
import java.util.Scanner;
public class IfElseWithScanner {
	public static void main(String[] args) {
		// passingPercentage = 65;
		// yourScorePercentage = take from scanner
		// check if you passed or failed
		
		Scanner scan = new Scanner(System.in);
		int passingPercentage = 65;
		System.out.println("Enter your score: ");
		int yourScorePercentage = scan.nextInt();
		if(yourScorePercentage >= passingPercentage) {
			System.out.println("Great! Your Prize your new freaking JOB");
		}else {
			System.out.println("So bad man. Go back home and CODE");
		}
		
		
	}
}
