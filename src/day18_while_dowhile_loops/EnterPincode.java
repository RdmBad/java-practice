package day18_while_dowhile_loops;
import java.util.*;
public class EnterPincode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secretPincode = 1234;
		
		
		//keep asking for a pincode until correct one entered
		
		int pincode = 0;
		while (pincode != secretPincode) {
			System.out.println("Enter pincode:");
			pincode = scan.nextInt();
		}
		System.out.println("Access aprooved");
	}
}
