package day27_arrays05;

import java.util.*;

public class Times {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hours = 0;
		int minutes = 0;
		int[] time1 = new int[2];
		int[] time2 = new int[2];

		System.out.println("Enter time:");
		hours = scan.nextInt();
		minutes = scan.nextInt();
		time1[0] = hours;
		time1[1] = minutes;
		System.out.println("Enter second time:");
		hours = scan.nextInt();
		minutes = scan.nextInt();
		time2[0] = hours;
		time2[1] = minutes;

		if ((time1[0] < 0 || time1[0] > 23) || (time1[1] < 0 || time1[1] > 59)) {
			System.out.println("First time invalid");
			return;
		}
		if ((time2[0] < 0 || time2[0] > 23) || (time2[1] < 0 || time2[1] > 59)) {
			System.out.println("Second time Invalid");
			return;
		}
		
		if (time1[0] > time2[0]) {
			System.out.println("Time 2 is earlier");
		} else if (time1[0] < time2[0]) {
			System.out.println("Time 1 is earlier");
		} else if (time1[0] == time2[0]) {
			if (time1[1] > time2[1]) {
				System.out.println("Time 2 is earlier");
			} else if (time1[1] < time2[1]) {
				System.out.println("Time 1 is earlier");
			} else if (time1[1] == time2[1]) {
				System.out.println("Equal time");
			}
		}
	}
}
