package A_HomeWork;

import java.util.Arrays;

public class camelLetterInEachWord {
public static void main(String[] args) {
	
	String str = "java is fun";
	int idx = 0;
	String first = "";
	String temp = "";
	String word = "";
	
	String[] arr = str.split(" ");
	for(int i = 0; i < arr.length; i++) {
		first = arr[i].substring(0,1);
		word = first.toUpperCase() + arr[i].substring(1);
		temp += word + " ";
	}
	temp = temp.substring(0, temp.length()-1);
	System.out.println(temp);
	
}
}
