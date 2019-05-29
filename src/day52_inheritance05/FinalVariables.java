package day52_inheritance05;

public class FinalVariables {
	public final int ROADSTER_MAX_RANGE = 610; // first way assigning value
	public final int MODEL_3_MAX_SPEED;
	public final int MODEL_X_PASSENGERS;
	public final String JAN = "January";

	public static final String COMPANY_NAME = "CyberTek";		// static instance variable
	public static final String ADMIN_USERNAME;

	static {
		ADMIN_USERNAME = "Admin"; // static variables can be assign only in static block or in same statement
	}

//	public FinalVariables(int max) {
//		MODEL_3_MAX_SPEED = max; // second way how t o assign value IN THE CONSTRUCTOR
//	}
// or
	public FinalVariables() {
		MODEL_3_MAX_SPEED = 350;
	}

	{
		MODEL_X_PASSENGERS = 7; // third way how to assign value to final variable IN THE INIT BLOCK
	}

	public static void main(String[] args) {
		final int MAX_PASSENGER_COUNT = 5;
		System.out.println(MAX_PASSENGER_COUNT);

		final int SSN;
		SSN = 1232131231;

		FinalVariables finalVars = new FinalVariables();
		System.out.println("Max range of roadster " + finalVars.ROADSTER_MAX_RANGE);
		System.out.println("Max speed of Model 3 " + finalVars.MODEL_3_MAX_SPEED);
		System.out.println("Max passenger of Model X " + finalVars.MODEL_X_PASSENGERS);
		System.out.println(Integer.MAX_VALUE);

		System.out.println("Company name: " + COMPANY_NAME);
		System.out.println("Company name: " + FinalVariables.COMPANY_NAME);
		System.out.println("Admin: " + ADMIN_USERNAME);

	}

}
