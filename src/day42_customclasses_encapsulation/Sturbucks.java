package day42_customclasses_encapsulation;

public class Sturbucks {
	public static void main(String[] args) {
		// declare an array that can store 2 Coffe objects
		// int[] nums = new int[2]
		// String[] str = new String [3];
		Coffee[] coffeeArray = new Coffee[2];
		coffeeArray[0] = new Coffee();
		coffeeArray[0].setCoffeeInfo("Americano", "TALL", 1.99, 30);
		coffeeArray[0].getCoffeeInfo();

		Coffee cup5 = new Coffee();
		cup5.setCoffeeInfo("LATTE", "venti", 4.33, 230);
		cup5.getCoffeeInfo();
		
		coffeeArray[1] = cup5;
		

	}

}
