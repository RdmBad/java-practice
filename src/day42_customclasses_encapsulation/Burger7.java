package day42_customclasses_encapsulation;

import java.util.*;

public class Burger7 {
	public static void main(String[] args) {
		Burger bur = new Burger();
		bur.name = "COWBOY";
		String[] ings = { "onion crisps", "american scheese", "pickles", "lettuce", "b7 sause" };
		bur.ingredients = ings;
		System.out.println(bur.name);
		System.out.println(Arrays.toString(bur.ingredients));
		
			System.out.println(bur.ingredients[0]);

		for (String ing : bur.ingredients) {
			System.out.println(ing);
		}
	}
}

