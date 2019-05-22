package day46_static_keyword;

public class CalcTest {

	public static void main(String[] args) {
		double result = Calculator.plus(55, 66); // static way 1 WAY: using without object
		System.out.println("Result: " + result);

		result = Calculator.minus(44, 11);
		System.out.println("Result: " + result);

		result = Calculator.multiply(9, 11);
		System.out.println("Result: " + result);

		Calculator c = new Calculator(); // 2 WAY : throught object
		c.multiply(4, 2);
		System.out.println("Result: " + c.multiply(3, 4));
	}
}
