package A_HomeWork;

import java.util.*;

public class ass93 {
	public static void main(String[] args) {
		String sentence = "wepublic of gamers";
		int n = 1;
		int count = 0;
		String temp = sentence.substring(0, 1);
		int idx = sentence.indexOf(temp);
		while (idx != -1) {
			count++;
			sentence = sentence.substring(idx + 1);
			idx = sentence.indexOf(temp);
		}
		if (count > 1) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
