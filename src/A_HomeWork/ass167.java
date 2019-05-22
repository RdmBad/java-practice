package A_HomeWork;

public class ass167 {
	public static void main(String[] args) {
		// test your code
		System.out.println(uniqueChars("wooden-spoon"));
	}

	public static String uniqueChars(String str) {
		// TODO: write your below
		int count = 0;
		String word = "";
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (temp == str.charAt(j) && i != j) {
					count++;
				}
			}
			if (count == 0) {
				word += temp;
			}
		}
	return word;
	}

}
