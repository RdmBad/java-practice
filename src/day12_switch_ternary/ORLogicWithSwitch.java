package day12_switch_ternary;
import java.util.Scanner;
public class ORLogicWithSwitch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char grade = scan.next().charAt(0);
		//A, B, C --> Pass        D, E --> Fail Invalid grade
		switch (grade) {
		case 'A':
		case 'B':
		case 'C':
			System.out.println("Pass");
			break;
		case 'D':
		case 'E':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Invalid grade");
		}
	}
}
