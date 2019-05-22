package A_HomeWork;

import java.util.*;

public class ass108 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String email = input.nextLine();

		// Write your code below

		int count = 0;

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				count++;
			}
		}
		if (count != 1) {
			System.out.println("invalid email");
		} else {
			String[] split = email.split("@");
			System.out.println("Email id: " + split[0]);
			System.out.println("Email domain: " + split[1]);
		}
	}
}
