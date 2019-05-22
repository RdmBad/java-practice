package day31_method03;

public class Calculator {
	public static void main(String[] args) {

	}

	public static void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("result: " + result);
	}

	public static void subtract(double num1, double num2) {
		double result = num1 - num2;
		System.out.println("result: " + result);
	}

	public static void multiply(double num1, double num2) {
		double result = num1 * num2;
		System.out.println("result: " + result);
	}

	public static void devide(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("cannot  / by zero");
			return;
		}
		double result = num1 / num2;
		System.out.println("result: " + result);
	}

	public static void remainder(double num1, double num2) {
		double result = num1 % num2;
		System.out.println("result: " + result);
	}

}
