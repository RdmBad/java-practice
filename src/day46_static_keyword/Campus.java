package day46_static_keyword;

public class Campus {
	private String city;
	static String country;
	static {
		System.out.println("Static block!!!!"); // executed ONLY ONCE before EVERYTHING ELSE, whenever the class is
		country = "USA"; // used.
	}

	static {
		System.out.println("Static block 2 _____");			// second static block! executed after first static block
		country = "Canada";
	}

	public Campus(String city) {
		System.out.println("Constructor");
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public static void campusInfo() {
		System.out.println("Welcome to campus");
	}
}
