package day19_loops;
import java.util.*;
public class GuessANumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
	
		int secretNumber = random.nextInt(101);  //THIS WILL GIVE US A RANDOM NUMBER
		int guessNumber;
		int count = 0;
		do {

			System.out.println("Guess a number:");
			guessNumber = scan.nextInt();
			if (count <= 5) {
				
				if (guessNumber < secretNumber) {
				System.out.println("Your number is too small");
				}else if (guessNumber > secretNumber) {
				System.out.println("Your number is too large");
				}else {
					System.out.println("You dont have any chance try it more! Sorry");
					return;
				}
			}
		
		}while (secretNumber != guessNumber || count != 5);
		System.out.println("Bingo. Congratulations! YOU ARE BILLIONAIRE");
	}
}
