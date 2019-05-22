package A_HomeWork;

import java.util.*;

public class ass150 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());
	}

	public static void timeConversion(String s) {
		/*
		 * Write your code here.
		 */
		String[] time = s.split(":");
		// System.out.println(Arrays.toString(time));
		if (time[2].endsWith("PM")) {
			switch (time[0]) {
			case "1": case "01":
				time[0] = "13";
				break;
			case "2": case "02":
				time[0] = "14";
				break;
			case "3": case "03":
				time[0] = "15";
				break;
			case "4": case "04":
				time[0] = "16";
				break;
			case "5": case "05":
				time[0] = "17";
				break;
			case "6": case "06":
				time[0] = "18";
				break;
			case "7": case "07":
				time[0] = "19";
				break;
			case "8": case "08":
				time[0] = "20";
				break;
			case "9": case "09":
				time[0] = "21";
				break;
			case "10":
				time[0] = "22";
				break;
			case "11":
				time[0] = "23";
				break;
			}
			String result = Arrays.toString(time);
			// System.out.println(result);
			result = result.substring(1, result.length() - 1).replace(",", ":").replace("PM", "").replace(" ", "");
			System.out.println(result);
		} else if (time[2].endsWith("AM")) {
			String result = Arrays.toString(time);
			result = result.substring(1, result.length() - 1).replace(",", ":").replace("AM", "").replace(" ", "");
			System.out.println(result);
		}
	}
}
