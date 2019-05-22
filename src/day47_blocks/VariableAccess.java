package day47_blocks;

public class VariableAccess {

	// instance variable
	int myInstanceVar = 40;
	// static variable
	static int myStaticVar = 55;

	public static void main(String[] args) {

	//	System.out.println(myInstanceVar);				cannot access to non-static from static method
		System.out.println(myStaticVar);

	// create object of VariableAccess and print my Instanse Variable
		VariableAccess v = new VariableAccess();
		System.out.println(v.myInstanceVar);
		System.out.println(v.myStaticVar);

	// Access static variable using class name
		System.out.println(VariableAccess.myStaticVar);
	}
}
