package day23_arrays;
import java.util.*;
public class CalculateSum {
	public static void main(String[] args) {
		// lets write a programm that will calculate sum of six numbers if numbers is less or equals to 0, ignore this number 
		//we need to ask user to privide the number
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		for(int i = 0; i < 6; i++) {
			System.out.println("Enter a number: ");
			num = scan.nextInt();
		if(num <=0) {
			continue;
		}
			sum += num;
			
		}
		System.out.println("Sum if: " + sum);
	}
}
