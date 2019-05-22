package day06_operators2;

public class IncrementDecrement {
	public static void main(String[] args) {
		int employees = 50;
		System.out.println("Employees: " + employees);
		
		employees++;                                   // add 1 
		System.out.println("Employees: " + employees);
		
		employees++;                                   // add/increment by 1
		System.out.println("Employees: " + employees);
		
		employees += 1;
		System.out.println("Employees: " + employees);
		
		employees = employees + 1;
		System.out.println("Employees: " + employees);
		
		employees--;                                   // decrease by 1
		System.out.println("Employees: " + employees);
		--employees;								   //  -1
		System.out.println("Employees: " + employees);
		
			//     ++ ==>  Will add 1 to the value
			//     -- ==> Will minus 1 
		
		int apples = 5;
		apples = apples + 1;
		apples += 1;
		apples++;

		

	}
}
