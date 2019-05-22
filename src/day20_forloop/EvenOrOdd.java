package day20_forloop;

public class EvenOrOdd {
public static void main(String[] args) {
	//1. print all even numbers in same line
	for (int n = 1; n <= 100; n++) {
		if (n % 2 ==0) { //check if it is even
			System.out.print(n + " ");
		}
	}
	
	System.out.println();
	//2. print all odd numbers in same line
	
	for(int j = 1; j <= 100; j++) {
		System.out.print(j + " ");
		}
	//3. sumOfOdds, sumOfEvens - calculate them and print out after the loop
		
	int sumOfOdds = 0;
	int sumOfEvens = 0;
	
	for(int num = 1; num <= 100; num++) {
		if(num%2 ==0 ) {
			sumOfEvens += num;
		}else {
			sumOfOdds += num;
		}
	}
	System.out.println("Sum of evens: " + sumOfEvens);
	System.out.println("Sum of odds: " + sumOfOdds);
}
}
