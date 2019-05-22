package day16_string_manipulation;

public class CapitalCity {
	public static void main(String[] args) {
		String str = "Moscow is a capital of Russia";
		//baku, Azerbaijan
		
		str = str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan");
		System.out.println(str);
		
		String email = "firstName_LastName@gmail.com";
		String company = "tesla";
		
		String newEmail = email.replace("gmail", company);
		System.out.println(newEmail);
		
	}
}
