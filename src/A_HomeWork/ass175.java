package A_HomeWork;

import java.util.*;

public class ass175 {
	public static void main(String[] args) {
		String db = "1etsy#2wooden#3spoon";
		String op = "delete";
		String id = "2";
		String data = "";

		String[] str = db.split("#");
		String temp = "";
		String result = "";
		int idx = Integer.parseInt(id);
		if (op.equals("add")) {
			String[] newStr = Arrays.copyOf(str, str.length + 1);
			newStr[idx - 1] = id + data;
			for (String each : newStr) {
				result += each + "#";
			}
			System.out.println(result.substring(0, result.length() - 1));
		} else if (op.equals("edit")) {
			str[idx - 1] = id + data;
			for (String each : str) {
				result += each + "#";
			}
			System.out.println(result.substring(0, result.length() - 1));
		} else if (op.equals("delete")) {
			ArrayList<String> str1 = new ArrayList<>();
			
		} else if (op.equals("none")) {
			System.out.println(db);
		}
	}
}

// end lameDb

//		System.out.print(lameDb("1etsy#2wooden#3spoon", "add", "4", "aaa") + "\n");
//
//		System.out.print(lameDb("1tst#2bla#3foo", "edit", "2", "bbb") + "\n");
//
//		System.out.print(lameDb("1tst#2bla#3foo", "delete", "1", "") + "\n");
//
//		System.out.print(lameDb("1tst#2bla#3foo", "none", "1", "") + "\n");
//
