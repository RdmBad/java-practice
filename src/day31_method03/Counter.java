package day31_method03;

public class Counter {
	public static void main(String[] args) {
		countUp(10);
		countDown(0);

	}

	public static void countUp(int up) {
		if (up < 1) {
			System.out.println("Invalid input");
		}
		for (int i = 1; i <= up; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void countDown(int down) {
		if (down > 5) {
			System.out.println("Invalid input");
		}
		for (int i = 5; i > down; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
