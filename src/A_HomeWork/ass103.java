package A_HomeWork;

import java.util.*;

public class ass103 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();

		String reversed = "";
		// TODO: start your code here
		String[] str = sentence.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			if(i == 0) {	
			reversed += str[i];
			}else {
				reversed += str[i] + " ";
			}
		}

		// End your code here. do not modify below statement
		System.out.println(reversed);

	}
}
