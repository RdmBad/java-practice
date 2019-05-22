package AdditionalWithVasyl;

import java.util.Arrays;

public class Numbers2 {
	public static void main(String[] args) {
		int[][] nums = { { 123, 532, 34, 643, -345, 73, 436, 344362, 547 },
						 { 12123, 657, -34, 56643, 567, 73, 345, 4563657, 35673576 },
						 { 22342, 343, 3453245, 34534, 567, -3, 345, 4563657, } };
	//  outer loop
	// that is changing rows
		int maximum = nums[0][0];
		int minimum = nums[0][0];
		int countPositive = 0;
		int countNegative = 0;
		int total = 0;
			for (int rows = 0; rows < nums.length; rows++) {
		//	System.out.println(Arrays.toString(nums[rows]));
	//	inner loop
	//	changing columns
				//nums[rows].length means length of specific array
				// if row = 0, then it's gonna be length of 1st array
				for(int columns = 0; columns < nums[rows].length; columns++) {
				//System.out.print(nums[rows][columns] + " | ");
			if(nums[rows][columns] > maximum) {
				maximum = nums[rows][columns];
			}
			if(nums[rows][columns] < minimum) {
				minimum = nums[rows][columns];
			}
			if(nums[rows][columns] > 0) {
				countPositive++;
			}else if (nums[rows][columns] < 0) {
				countNegative++;
			}
			// to find total
			total += nums[rows][columns];
			System.out.println();
		}

	}
System.out.println("Minimum is: " + minimum);
System.out.println("Maximum is: " + maximum);
System.out.println("Positive count is: " + countPositive);
System.out.println("Negative count is: " + countNegative);
System.out.println("Total sum is: " + total);
	}
}
