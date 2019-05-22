package day21_loops_practice1;

import java.util.*;

public class Register_task {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many items you purchased?");
		int count = scan.nextInt();
		String list = "";
		double totalPrice = 0;
		for(int i = 1; i <= count; i++) {
			System.out.println("What is item " + count + "?");
			String item = scan.next();
			System.out.println("Whats the price?");
			double price = scan.nextDouble();
			list += item + ", ";
			totalPrice = totalPrice + price;
			
		}
	
		System.out.println("Your total price: " + totalPrice);
	System.out.println("Your list of purchases is: " + list);
	}
}
