package A_HomeWork;

public class ass168_cover_Me_with_brackets {
	public static void main(String[] args) {
		//System.out.println(coverString("java methods", "me")); // java [me]thods

		coverString("Wooden Spoon", "oo");
	
	}

	public static void coverString(String main, String coverME) {
		int l1 = coverME.length();
		String temp = "";
		String temp1 = "";
		for (int i = 0; i < main.length()-l1; i++) {
			if (main.substring(i, l1 + i).equalsIgnoreCase(coverME)) {				
				temp = main.substring(0,i) + "[" + coverME + "]";
				temp += temp.substring(l1 + i);
				System.out.println(temp);
			}
		}
		//System.out.println(temp);
	//	System.out.println("[" + main + "]");
	}
}
