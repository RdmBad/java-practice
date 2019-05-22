package day19_loops;

public class DoWhile {
	public static void main(String[] args) {
		
		//print 1 to 10 using do while loop
		
		int i = 1;
		do {
			System.out.print(i + ", ");
			i++;
		}while (i <= 10);
	
		//write a do while loop to calculate sum of numbers
		//between 1 to 5
		//1+2+3+4+5 ==>
	
		int sum = 0;
		int j = 1; 
		do {
			sum += j;
			j++;
			System.out.println(sum);
		}while (sum <= 5);
		
		System.out.println("Sum from 1 to 5 is: " +sum);
		}
		
	}

