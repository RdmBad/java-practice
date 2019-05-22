package day04_primitives_operators;

public class AgeCalculator {
	public static void main(String[] args) {
		//Declare variable yearOfBrith and assign some year
		
		int yearOfBirth = 1986;
		
		//Declare variables currentYear and assign 2019
		
		int currentYear = 2019;
		
		//Declare variable age and calculate the age and
		//assign result to it
		
		int age = currentYear - yearOfBirth;
		
		//Print: if you are born in year
		//Then you are <> years old
		
		System.out.println("If you are born in " + yearOfBirth + " then you are " + age + " years old");
		
	}
	
}
