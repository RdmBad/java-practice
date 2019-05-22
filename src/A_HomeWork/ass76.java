package A_HomeWork;

import java.util.*;

public class ass76 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String start = scan.next();
		String end = scan.next();
		String point = "";

		if (start.equals(end)) {
			System.out.println(start + " found");
		} else {

			while (!start.equals(end)) {
				if (start.equals("A")) {
					point += "right > ";
					start = "B";
				} else if (start.equals("B")) {
					point += "down > ";
					start = "C";
				} else if (start.equals("C")) {
					point += "left > ";
					start = "D";
				} else if (start.equals("D")) {
					point += "up > ";
					start = "A";
				}
			}
			System.out.println(point.substring(0, point.length() - 3) + ": " + end + " found");
		}
	}
}
