package day33_method05;

public class Calculator {
	public static void main(String[] args) {
		// addVoid(10, 20);
		// below line will not work because addVoid does not return a value. it just
		// perform action
		// int result = addVoid(10,20);
		// System.out.println(addVoid(10,20);
		int result = add(10, 20);
		System.out.println("Result: " + result);
		result = add(10, 30);
		System.out.println("Result: " + result);
		System.out.println(add(6, 2));
	}

	public static void addVoid(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("Sum: " + sum);
	}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public static double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
	}

	public static double substraction(double num1, double num2) {
		double result = num1 - num2;
		return result;
	}

	public static double divide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("ERROR: do not divide by zero");
			return 0;
		} else {
			double result = num1 / num2;
			return result;
		}
	}

}
