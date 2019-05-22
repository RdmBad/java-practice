package day30_methods02;
import java.util.*;
public class print5stars {
	public static void main(String[] args) {
		print5Stars();
		// call print5Starts 100 times
		int count = 0;
		for (int i = 1; i < 101; i++) {
			print5Stars();
			count++;
		}
		System.out.println("Count of print is: " + count);
		introduce();

	}
	
	public static void introduce() {
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter name:");
	String name = scan.next();
	System.out.println("Nice to meet you " + name);
	
	}

	public static void print5Stars() {
		System.out.println("*****");
	}

}
