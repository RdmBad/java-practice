package A_HomeWork;

public class ass195_Anagram {
	public static void main(String[] args) {

		String word1 = "listen";
		String word2 = "silent";

		word1 = word1.replace(" ", "").toLowerCase();
		word2 = word2.replace(" ", "").toLowerCase();

		int count1 = 0;
		int count2 = 0;

		if (word1.length() == word2.length()) {
			for (int i = 0; i < word1.length(); i++) {
				count1++;
				for (int j = 0; j < word2.length(); j++) {
					if (word1.charAt(i) == word2.charAt(j)) {
						count2++;
						break;
					}
				}
			}
			if (count1 == count2) {
				System.out.println(true);
			} else {
				System.out.println(false);
			}
		}else {
			System.out.println(false);
		}
	}
}
