package day30_methods02;

import java.util.*;

public class myNumbers {
	public static void main(String[] args) {
		showMe5Numbers();
		doPush10Ups();
		rangePrint();
	}

	public static void showMe5Numbers() {
		Random rand = new Random();

		int num = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print(rand.nextInt(1001) + " ");
		}
		System.out.println();
	}

	public static void doPush10Ups() {
		int count = 1;
		for (int i = 1; i < 11; i++) {
			System.out.println("Pushup - " + count);
			count++;
		}
		System.out.println("Time to rest");
	}

	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		if (num1 < num2) {
			while (num1 <= num2) {
				System.out.print(num1);
				num1++;
			}
		} else if (num1 > num2) {
			while (num2 <= num1) {
				System.out.print(num1);
				num1--;
			}
		} else if (num1 == num2) {
			System.out.println("Nums equal");
		}
	}
}
