package day24_arrays1;

public class SplitSentence {
	public static void main(String[] args) {
		int counter = 0;
		String setence = "Java is heneral-purpose computer- programming"
				+ "language that is cconcurrent, class-based, object-oriented," + "and specifially designed to have as"
				+ "few implementation dependecies as possib;e.";

		String[] words = setence.split(" ");
		for (String str: words) {
			if (str.equals("is")) {
				break;
			}
			counter++;
		}
		System.out.println("Position: " + counter);
		System.out.println(words[counter]);
	}
}
