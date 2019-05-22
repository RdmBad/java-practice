package day21_loops_practice1;
import java.util.*;

import javax.swing.plaf.synth.SynthSeparatorUI;
public class task {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		int num1 = 0;
		int num2 = 0;
			do {
				System.out.println("Enter first number:");
				num1 = scan.nextInt();
				System.out.println("Enter second number:");
				num2 = scan.nextInt();
				
				
			} while (num1 + num2 <= 100);
			System.out.println("Good numbers");
	}
}
