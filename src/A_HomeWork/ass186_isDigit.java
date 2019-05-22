package A_HomeWork;

public class ass186_isDigit {
public static void main(String[] args) {
	String word = "asd123fd45gh4";
	String result = "";
	for(int i = 0; i < word.length(); i++) {
		if(Character.isDigit(word.charAt(i))) {
			result += word.charAt(i);
		}
	}
	System.out.println(result);
}
}
