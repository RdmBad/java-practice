package day36_wrapperclasses_arraylistintro;

public class Boxing {
public static void main(String[] args) {
	// AUTOBOXING    -> primitive > object
	Integer num1 = 1234;
	int n = 5;
	Integer num2 = n;
	// UNBOXING  	 -> object > primitive
	Double d1 = new Double(34.2);
	double d2 = d1;
	System.out.println("d1 is - " + d1);
	System.out.println("d2 is - " + d2);
	
	long l1 = new Long(6000000); // unboxing
	Long l2 = new Long(348753495L); // no boxing
	long l3 = l2;	// unboxing
	Long l4 = l3; 	// autoboxing

	Integer num3 = Integer.valueOf(345);
	//  Double d3 = num3; casting not possible with wrapper classes
	
}
}
