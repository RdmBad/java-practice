package day18_while_dowhile_loops;
import java.util.*;
public class PinCodeV2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secretPincode = 4321;
		
		//give only 3 attempts
		//if attempts reaches more than 3 print card blocked
		
		int pincode = 0;
		int attempts = 0;
		
		while (pincode != secretPincode) {
			System.out.println("Enter pincode:");
			pincode = scan.nextInt();
			attempts++;
			if(attempts == 3 && pincode != secretPincode) {
				System.out.println("Your card BLOCED");
				return;
			}
		}
		System.out.println("Access GRANTED");
	}
}
