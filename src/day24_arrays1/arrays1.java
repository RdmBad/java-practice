package day24_arrays1;
import java.util.*;
public class arrays1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//The final field array.length cannot be assigned
		//numbers.length = 5;
		
		for(int i = 0; i<numbers.length; i ++) {
		sum = sum + numbers[i];
	}
		System.out.println("Sum: " + sum);
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i<numbers.length;i++);
			if (numbers[i] > max) {
			max =numbers[i];
			
			}	
			System.out.println("Max value: " + max);
			
			// task
			// please find min value in the array
			
			int min = Integer.MAX_VALUE;
			fir(int k = 0; k<numbers.length; k++) {
				if(numbers[k] < min) {
					min = numbers[k];
				}
			}
			System.out.println("Min value: " + min);
	}

}
