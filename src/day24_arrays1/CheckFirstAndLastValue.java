package day24_arrays1;

public class CheckFirstAndLastValue {
	public static void main(String[] args) {
		// write a program that will print true
		// if first and last number is the same
		// if first and last value in the array of ints
		// if same, print true

		int[] numbers = { 12, 41, 213, 21, 42, 12 };
		boolean equals = numbers[0] == numbers[numbers.length - 1];
		System.out.println(equals);

		System.out.println(numbers[0] == numbers[numbers.length - 1]);

		if (numbers[0] == numbers[numbers.length - 1]) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}
}
