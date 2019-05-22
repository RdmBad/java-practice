package day22_loops_practice2;

public class LookForWordInString {
	public static void main(String[] args) {
		
		//check if temp equals "hi", if true< add 1 to count
		String sentence = "He said hi, then she replied hi. hi guys!";
		
		int count = 0;
		for(int i = 0; i < sentence.length()-1; i++) {
			String temp = sentence.substring(i, i+2); //2 letters
			System.out.println(temp);
		if(temp.equalsIgnoreCase("hi")) {
			count += 1;
		}
		}

		System.out.println("Count of 'Hi' is: " + count);
	}
}
