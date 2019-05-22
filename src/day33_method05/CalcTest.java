package day33_method05;

public class CalcTest {
	public static void main(String[] args) {
		System.out.println(Calculator.add(3, 1));
		System.out.println(Calculator.multiply(5, 6));
		System.out.println(Calculator.divide(9, 3));
		System.out.println(Calculator.substraction(10, 5));

		int addResult = Calculator.add(21, 41);
		double mResult = Calculator.multiply(50, 40);
		double sResult = Calculator.substraction(50, 10);
		double dResult = Calculator.divide(19823, 123);

		System.out.println("addResult: " + addResult);
		System.out.println("mResult: " + mResult);
		System.out.println("sResult: " + sResult);
		System.out.println("dResult: " + dResult);

		double a = 10.0, b = 5.0;
		double myResult = Calculator.substraction(a, b);
		System.out.println("myResult: " + myResult);

		double[] dNums = { 2.0, 4.0 };
		double result2 = Calculator.multiply(dNums[0], dNums[1]);
		System.out.println("result2: " + result2);

		if (Calculator.add(10, 16) == 26) {
			System.out.println("Add Unit test Passed");
		} else {
			System.out.println("Add Unit test Failed");
		}
		String str = "java";
		if(str.length() == 4) {
			System.out.println("It is 4 characters");
		}else {
			System.out.println("It is not 4 characters");
		}
	}
}
