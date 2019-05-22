package day23_arrays;

public class PrintWord {
	public static void main(String[] args) {
		String word = "java";
		for(int i = 0; i < word.length(); i++) {
			if(word.substring(i, i+1).equals("a")) {
				continue;
			}
		System.out.println(word.substring(i, i+1));
		}
}
}
