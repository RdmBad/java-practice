package A_HomeWork;

import java.util.*;

public class ass121 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split(",");
		String small = arr[0];
		String all = "";
		for (int i = 0; i < arr.length; i++) {
			if (small.length() > arr[i].length()) {
				small = arr[i];
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].length() == small.length()) {
				all += arr[i] + " ";
			}
		}
		String[] result = all.split(" ");
		System.out.println(Arrays.toString(result));
	}
}