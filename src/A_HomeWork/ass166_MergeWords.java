package A_HomeWork;

public class ass166_MergeWords {
	public static void main(String[] args) {
		String one = "12345";
		String two = "abcde";
		String sum = "";

		for (int i = 0; i < one.length(); i++) {
			sum += one.charAt(i);
			for (int j = i; j < two.length(); j++) {
				sum += two.charAt(j);
				break;
			}
		}
		if (one.length() > two.length()) {
			System.out.println(sum + one.substring(one.length()));
		} else {
			System.out.println(sum + two.substring(one.length()));
		}
	}
}
