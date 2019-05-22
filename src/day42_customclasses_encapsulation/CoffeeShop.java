package day42_customclasses_encapsulation;

public class CoffeeShop {
	public static void main(String[] args) {

		Coffee cup = new Coffee();
		cup.name = "ICED CARAMEL MACCHIATTO";
		cup.size = "grande";
		cup.price = 4.75;
		cup.calories = 250;

		cup.getCoffeeInfo();
		Coffee cup2 = new Coffee();
		cup2.setName("java chip");
		cup2.size = "VENTI";
		cup2.calories = 600;
		cup2.price = 5.95;
		cup2.getCoffeeInfo();

		Coffee cup3 = new Coffee();
		cup3.setName("iced coffee");
		cup3.setSize("grande");
		cup3.setPrice(2.45);
		cup3.setCalories(60);
		cup3.getCoffeeInfo();
		
		Coffee cup4 = new Coffee();
		cup4.setCoffeeInfo("MOCHA", "venti", 5.32, 120);
		cup4.getCoffeeInfo();
	
	}
}
