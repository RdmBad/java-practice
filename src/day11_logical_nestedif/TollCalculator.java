package day11_logical_nestedif;
import java.util.*;
public class TollCalculator {
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Enter Vehicle Type:"); //1,2
	int carType = keyboard.nextInt();
	
	System.out.println("Is it rush hour: yes | on");
	String rushHour = keyboard.next();
	// check if rushHour string is "yes" => assign true to isRushHour
	//		 if it is "no", assign false to isRushHour
	

	
	
	boolean isRushHour;
	if(rushHour.equalsIgnoreCase("yes")) {
		isRushHour = true;
		System.out.println("RUSHHOUR");
	} else {
		isRushHour = false;
		System.out.println("Not a RushHour");
	}

	double price = 0;
	
	if(carType ==1) {
		if(isRushHour) {
			price = 30.0;
			System.out.println("Price is: " + price);
		} else {
			price = 5.0;
			System.out.println("Pricec is: " + price);
		}
	} else if (carType ==2) {
		if(isRushHour) {
			price = 55.30;
			System.out.println("Price is: " + price);
		} else {
			price = 15.99;
			System.out.println("Price is: " + price);
		}
	}
	
	
	}
}
