package day07_scanner_operators;

public class ComparisonRelational {
	public static void main(String[] args) {
		
		/*
		 *   == - equals
		 *   != - not equals
		 *   >  - greater than
		 *   >= - greater than or equals
		 *   <  - less than
		 *   <= - less than or equals
		 */
	
	//== 
		
		System.out.println(5 == 5);		//true
		System.out.println(50 ==5);		//false
	
		int searchCount = 5000;
		System.out.println(searchCount == 5000); 	//true
	
		int expectedCount = 5010;
		System.out.println(searchCount == expectedCount); 	//5010
	
		 /*
		  * 	= --> assignment operator
		  * 	== --> equals, comparison operator 
	      */
		
		int speedLimit = 55;
		int currentSpeed = 75;
		System.out.println(currentSpeed == speedLimit);		//false
		
		boolean atLimit = currentSpeed == speedLimit;
		System.out.println("At Speed limit: " + atLimit);  //false

		boolean overLimit = currentSpeed > speedLimit;
		System.out.println("Over speed limit: " + overLimit);  //true
		
		  boolean underLimit = currentSpeed < speedLimit;
		//boolean underLimit = speedLimit > currentSpeed;
		
		  System.out.println("Under Limit: " + underLimit);
		  
		  double balance =  150.0;
		  
		  boolean broke = balance <= 0.0;
		  System.out.println("Broke? - " + broke);

		  double transaction = 155.5;
		  broke = (balance - transaction) < 0;
		  System.out.println("Will make broke/negative? - " + broke);
		  System.out.println("Balance: " + balance);
		  System.out.println("Transaction: " + transaction);
		  		  
	}
}
