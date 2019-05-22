package day29_method01;

public class Student {
	public static void main(String[] args) {
		study();
		study();
		study();
		sayHello();
		code();
		
	}
	
	public static void study() {
		System.out.println("Student is studying");
	}

	public static void sayHello() {
		System.out.println("Hello friends");
		System.out.println("How are you today?");
	}
	
	//create a method with name code.
	//"Inside code method"
	//"Student is coding Java"
	public static void code() {
		System.out.println("Inside code method");
		System.out.println("Student is coding Java");
	}

}
