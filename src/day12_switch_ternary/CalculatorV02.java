package day12_switch_ternary;
import java.util.*;
public class CalculatorV02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		double num1 = scan.nextDouble();
		System.out.println("Enter second number:");
		double num2 = scan.nextDouble();
		double result = 0.0;
		System.out.println("Choose any operator: + , - , * , / , %.");
		String operator = scan.next();
		switch (operator) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "%":
				result = num1 % num2;
				break;
			default:
		}
	System.out.println("Result is: " + result);
	
	}
}
