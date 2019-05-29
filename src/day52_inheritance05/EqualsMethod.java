package day52_inheritance05;

public class EqualsMethod {
	public static void main(String[] args) {

		Computer comp1 = new Computer("IMac", "Space Grey");
		Computer comp2 = new Computer("IMac", "Space Grey");
		Computer comp3 = comp2; // point to same object

		System.out.println(comp1 == comp2);
		System.out.println(comp1.equals(comp2));

		System.out.println(comp3 == comp2);
		System.out.println(comp3.equals(comp2));

		String str1 = "java";
		String str2 = new String("java");
		
		// checking only of str1 and str2 point to same object
		System.out.println(str1 == str2); // false

		// Checking value in the str1 and str2
		// compares values, not reference 
		System.out.println(str1.equals(str2)); // true

	}
}
