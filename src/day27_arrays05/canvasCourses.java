package day27_arrays05;

import java.util.*;

public class canvasCourses {
	public static void main(String[] args) {
		String url = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter link:");
		url = scan.next();
		String[] urlArr = url.split("/");
		int number = Integer.parseInt(urlArr[urlArr.length - 1]);
		switch (number) {
		case 147:
			System.out.println("Java Programming");
			break;
		case 204:
			System.out.println("Mentoring session");
			break;
		case 149:
			System.out.println("SDLC");
			break;
		case 152:
			System.out.println("QA Testing");
			break;
		case 144:
			System.out.println("Team activity");
			break;
		case 143:
			System.out.println("Welcome kit");
			break;
		default:
			System.out.println("Invalid number");
		}
	}
}
