package A_HomeWork;

public class ass143 {
	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int column = 1; column <= 5; column++) {
				if ((row >= 2 && row <= 4) && (column >= 2 && column <= 4)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
