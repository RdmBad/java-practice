package A_HomeWork;

import java.util.*;

public class ass97 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		int countJava = 0;
		int countPython = 0;
		for (int i = 0; i < sentence.length() - 4; i++) {
			String temp = sentence.substring(i, i + 4);
			if (temp.equals("java")) {
				countJava++;
			}
		}
		for(int i = 0; i < sentence.length()-6; i++) {
			String temp = sentence.substring(i, i+6);
			if(temp.equals("python")) {
				countPython++;
			}
		}
		if(countJava == countPython) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}
}
