package day18_while_dowhile_loops;

public class StairsCase {
	public static void main(String[] args) {
		String stairs = "*";
		//System.out.println(stairs);
		//stairs = stairs + "*";
		//System.out.println(stairs);
		/*
		  *
		  **
		  ***
		  ****
		  *****
		  ******
		  *******
		 */
		
		//stairs += "*";
		//System.out.println(stairs);
		
		// 1) with the counter
		int num = 1;
		while (num <= 10) {
			System.out.println(stairs);
			stairs += "*";
			num++;
		}
		
		// 2) checking length()
		stairs = "*";
		while(stairs.length() <= 10) {
			System.out.println(stairs);
			stairs += "*";
		}
		
	}
}
