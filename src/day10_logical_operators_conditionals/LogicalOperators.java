package day10_logical_operators_conditionals;

public class LogicalOperators {
	public static void main(String[] args) {
		
	
	/*
	 AND	(&&)  (ampersand)
	 OR  	(||)  (pipe)
	 NOT	(!)   (Exlamation mark)
	 
	 1)  &&  ===>
	 
	 Condition1 && condition2 
	 
	 true and true ===> true
	 true and false ==> false
	 
	 2) OR  (||) Returns/gives TRUE when any of conditions is true.
	 
	 Condition1 || condition2
	 
	 true  OR true   ===>  true
	 true  OR false  ===>  true
	 false OR true   ===>  true
	 false OR false  ===>  false
	 
	 3) NOT (!) OPERATOR:
	  
	  REVERSES THE BOOLEAN VALUE.
	  if condition is false, it will return true
	  if condition is true, it will return false
	  
	  true  ==> false
	  false ==> true
	 
	 != is not equal  => comparison operator
	 int a = 10;
	 int b = 12;
	 
	 a
	 
	 */
	
	boolean isNiceWeather = true;
	int hourlyRate = 50;

	if (hourlyRate > 40) {
		System.out.println("too low");
	} else {
		System.out.println("rate is good");
	
	
	if(!isNiceWeather) {     //false
		System.out.println("Dont go out for runnig");
	}else {
		System.out.println("Lets go out for running");
	}
	
	double price = 100.0;
	boolean b = price > 200;       //  false
	boolean b2 = !(price > 200);   //  true 
	
	
	
	
	
	
	}
}
}


