package A_HomeWork;

public class ass194_palindrome {
	public static void main(String[] args) {

//	String check = "Nurses run";
//	check.replace(" ", "").toLowerCase();
//	
//	for(int i = 0; i < check.length()/2; i++) {
//		if(check.charAt(i) == check.charAt(check.length()-i)) {
//			System.out.println("palindrom");
//		}else {
//			System.out.println("No palindrom");
//		}
//	}
//	
		String check = "";
		check = check.replace(" ", "");
		String res = "";
		for (int i = check.length() - 1; i >= 0; i--) {
			res += check.charAt(i);
		}

		if (res.equalsIgnoreCase(check)) {
			System.out.println(true);
		}
		System.out.println(false);
	}
}
