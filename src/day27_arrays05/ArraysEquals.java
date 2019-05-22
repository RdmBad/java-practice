package day27_arrays05;
import java.util.*;
public class ArraysEquals {
	public static void main(String[] args) {
		int[] num1 = { 4, 5, 6, 10, 100 };
		int[] num2 = { 4, 5, 6, 10, 100 };
		System.out.println(Arrays.equals(num1, num2));
		if(Arrays.equals(num1, num2)) {
			System.out.println("They are exactly same");
		}else {
			System.out.println("Mismatched value present");
		}
	
	String[] strArr1 = {"one", "two", "three"};
	String[] strArr2 = {"One", "Two", "three"};
	System.out.println(Arrays.equals(strArr1, strArr2));
	boolean match = Arrays.equals(strArr1, strArr2);
	System.out.println("Match: " + match);
	
	}
}
