package day12_switch_ternary;
import java.util.*;
public class CalculatorV01 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		double result = 0.0;
		// get numbers
		System.out.println("Enter first number:");
		double num1 = input.nextDouble();
		
		// get operator
		System.out.println("Select operator: + , - , * , / , %");
		String operator = input.next();
			
		
		System.out.println("Enter second number");
		double num2 = input.nextDouble();
		
		// perform calculation and display result
		if(operator.equals("+")) {
			result = num1 + num2;
		} else if (operator.equals("-")) {
			result = num1 - num2;
		} else if (operator.equals("*")) {
			result = num1 * num2;
		} else if (operator.equals("/")) {
			result = num1 / num2;
		} else if (operator.equals("%")) {
			result = num1 % num2;
		} else {
			System.out.println("Invalid operator selected: " + operator);
			return;  // Do not execute the remaining code. STOP HERE
		}
		
		System.out.println("Result: " + result);
	}

}
