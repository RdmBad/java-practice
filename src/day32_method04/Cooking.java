package day32_method04;

public class Cooking {
	public static void main(String[] args) {
		makePancakes();
		System.out.println();
		makePasta();
		cook("Omlet", "Eggs, Salt, Tomato, Green peppers, Onions");
	}

	public static void makePancakes() {
		System.out.println("~~~PANCAKES RECIPE~~~");
		add("Milk, Eggs, Flour, Sugar, Salt");
		mix(120);
		fry(3);
		System.out.println("~~~ENJOY YOUR DELICIOUS PANCAKES~~~");
	}

	public static void makePasta() {
		System.out.println("~~~ITALIAN PASTA RECIPE~~~~");
		add("Water, Salt, Olive Oil");
		boil(2);
		add("Spagetti Pasta");
		boil(9);
		mix(60);
		add("Parmesan cheese, Marinara");
		System.out.println("~~~~ DELICIOUS ITALIAN PASTA IS READY ~~~~");
	}

	public static void cook(String dish, String ingredients) {
		System.out.println("~~" + dish.toUpperCase() + " RECIPE~~");
		add(ingredients);
		System.out.println("Cook it until it is cooked");
		System.out.println("~~" + dish.toUpperCase() + " IS READY~~~");
	//	we could also check value of dish and call matching method
	//	if(dish.equals("pancakes")) {
	//		makePancakes();
	//	}
	}

	public static void add(String food) {
		System.out.println("Add " + food);
	}

	public static void mix(int seconds) {
		System.out.println("Mix for " + seconds + " seconds");
	}

	public static void fry(int seconds) {
		System.out.println("Fry if for " + seconds + " seconds");
	}

	public static void boil(int minutes) {
		System.out.println("Boil for " + minutes + " minutes");
	}
}
