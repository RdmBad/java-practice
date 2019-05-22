package day10_logical_operators_conditionals;

public class IfStatementWithBooleanVariables {
	public static void main(String[] args) {
		boolean isBreakTime = true;
		if(isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
		} else {
			System.out.println("Not Break time yet.");
		}
	
	 // second version
		
		if(isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		} else {
			System.out.println("Not Break time yet.");
		}
	
		boolean qualified = false;
		//send a notification message if not qualified
		//we need to check if qualified variable contains FALSE
		
		if(qualified) {
		System.out.println("Your application was not approved. Thank you");
			
		}
	}
}



	

