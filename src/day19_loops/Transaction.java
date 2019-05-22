package day19_loops;
import java.util.*;
public class Transaction {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current balance?");
		double balance = scan.nextDouble();
		int count = 0;		

		while (balance > 0) {
			count++;
			System.out.println("What is transaction #" + count + " amount:?");
			double transaction = scan.nextDouble();
			if(transaction > balance) {
				System.out.println("Your balance is about to be negative due to this transaction");
			}
			balance -= transaction;
			System.out.println("Current balance is: " + balance);
			
		}
		
		System.out.println("You have insufficient funds, your balancec is: " + balance);
		System.out.println("Successful transaction count is: #" + count);
	}
	
	}

