package A_HomeWork;

public class ass166_MergeWords {
	public static void main(String[] args) {
		String word1 = "12345";
		String word2 = "abcde";
		String sum = "";

//		if (word1.length() > word2.length()) {

		for (int i = 0; i < word1.length(); i++) {
			sum += word1.charAt(i);
			for (int j = i; j < word2.length(); j++) {
				sum += word2.charAt(j);
				break;
			}
		}
		System.out.println(sum);

	}
}
//  jsaevlae[nium]> but was:<jsaevlae[]>
//  sjealvea
//
//
//
//
//
