package day23_arrays;

public class PrintNumbersWithLoop2 {
	public static void main(String[] args) {
		// outer loop
		for (int j = 1; j <= 10; j++) {
			// inner loop
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
