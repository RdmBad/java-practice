package day12_switch_ternary;
import java.util.*;
public class SwitchScore {
public static void main(String[] args) {
	
	int score = 2;
	//1 ->
	//2 ->
	switch (score) {
		case 1:
			System.out.println("Score is 1");
			break;  //exit switch statement
		case 2:
			System.out.println("Score is 2");
			break;  // exit from switch statement
		case 3: 
			System.out.println("Score is 3");
			break;
		default:
			System.out.println("Invalid score");
			break;  // works without this as well.
	}
	
	System.out.println("##### DAY SELECTOR ######");
	Scanner scan = new Scanner(System.in);
	System.out.println("Choose the day:");
	int day = scan.nextInt();
	
	switch (day) {
		case 1: 
			System.out.println("Monday");
			break;
		case 2: 
			System.out.println("Tuesday");
			break;
		case 3: 
			System.out.println("Wednesday");
			break;
		case 4: 
			System.out.println("Thursday");
			break;
		case 5: 
			System.out.println("Friday");
			break;
		case 6: 
			System.out.println("Saturday");
			break;
		case 7: 
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid day selected!");
	}
	
	
	
}
}
