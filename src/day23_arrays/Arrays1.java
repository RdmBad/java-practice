package day23_arrays;

public class Arrays1 {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		int num1 = 5;
		int num2 = 7;
		int num3 = 10;
		//assign to the first variable value of num1
		numbers[0] = num1;
		numbers[1] = num2;
		numbers[2] = num3;
		
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		System.out.println("***********");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
			
		String[] names = new String[5];
		String[] names2 = {"Bill", "Roman", "Vlad", "Burak", "Maria"};
		System.out.println(names2[3]);
		System.out.println("Numbers of items: " + names2.length);
		
		String[] countries = {};
		countries[0] = "USA";
		//Array HAS FIXED SIZE
		//double[] values = 
		String[] fruits = new String[] {"apples", "oranges"};
		//for each loop stands for collections of data
		//we need specify data type, variable name : our collection of data
		//for each loop
		// for enhanced loop
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}
}
