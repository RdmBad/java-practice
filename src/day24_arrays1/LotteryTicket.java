package day24_arrays1;
import java.util.*;
public class LotteryTicket {
	public static void main(String[] args) {
		int[] lotteryNumbers = {12, 45, 3, 62, 42, 90};
		System.out.println(Arrays.toString(lotteryNumbers));
		Arrays.sort(lotteryNumbers);
		System.out.println(Arrays.toString(lotteryNumbers));
		// binary search work only with a sorted array
		int index = Arrays.binarySearch(lotteryNumbers, 45);
		System.out.println("Position: " + index);
	// if value doesnt exist
		int index2 = Arrays.binarySearch(lotteryNumbers, 5);
		System.out.println("Position: " + index2																																																																																																																																																																																																																																																																						);
	
	}
}
