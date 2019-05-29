package day52_inheritance05;

public class FinalMethods {
	public final void method1() {
		System.out.println("Final method 1");
	}

	public final static void staticMethod(String word) {
		System.out.println("staticMethod: " + word);
	}
}

class Sub extends FinalMethods {
	// cannot override sinec it is a final method

	// public void method1() {
	// System.out.println("Overrided method 1");
	public void method1(String str) {
		System.out.println("Overrided method 1" + str);
	}

}
