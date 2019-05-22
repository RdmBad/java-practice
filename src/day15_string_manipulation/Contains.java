package day15_string_manipulation;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		String list = "potatos, apples, tomatoes, eggs, milk, bread, cereal, meat";
		if (list.contains("eggs")) {
			System.out.println("eggs are here");
		}else {
			System.out.println("Lets add eggs now");
		}
	boolean hasApples = list.contains("apples");
	System.out.println("Contains apples: " + hasApples);
	
	boolean hasCucumber = list.toLowerCase().contains("cucumbers");
	System.out.println("Contains cucumbers: " + hasCucumber);
	
	//Assign your name and check it contains "a" or "e" letters
	String name = "Erdem";
	if (name.contains("a") || name.contains("e")) {
		System.out.println("Name is contains letters a or e");
	} else {
		System.out.println("'a' or 'e' is missing");
	}
	
	
	}
}
