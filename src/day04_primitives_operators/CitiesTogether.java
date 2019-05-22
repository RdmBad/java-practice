package day04_primitives_operators;

public class CitiesTogether {

//create class
//declare 3 String variables
	//city1
	//city2
	//city3
	//Assign values:
	//Tashkent
	//Kyiv
	//Moscow
	//Print: From Tashkent to Kyiv is $500
		   //From Moscow to Tashkent is $550
	//		I have been to Tashkent, Moscow< Kyiv.

	public static void main(String[] args) {
		String city1 = "Tashkent";
		String city2 = "Kyiv";
		String city3 = "Moscow";
		System.out.println("From "+city1+" to "+city2+" is $500");
		System.out.println("From "+city3+" to "+city1+" is $550");
		System.out.println("I have been to "+city1+", "+city2+", "+city3+".");
		
		//String app = "Slack";
		    //We use <Slack> for messaging with Classmates
		    //System.out.println("We use "+app+" for messaging with Classmates");

		String app = "Slack" + " and WhatsApp";
		System.out.println("We use "+app+" for messaging with Classmates");
	}
	
}
