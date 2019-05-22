package day34_methods06;
import java.util.*;
public class VarArgs {
	public static void main(String... args) {
		printWord("red", "blue", "yellow"); // 3 values
		printWord("grey"); // 1 value
		printWord(); // empty. so array will be empty
		String[] myPets = {"cat", "horse", "dog", "sheep", "goat"};
		printWord(myPets);
		
		System.out.println(sum(10,20,30));

		int budget = 200;
		if(sum(10,45,110,30) <= budget) {
			System.out.println("Keep shoping");
		}else {
			System.out.println("Broke");
		}
		
		int total = sum(23,4324,23,234,55);
		System.out.println("Total: " + total);
		
		cook("Burrito Bowl", "Rice", "Beans", "Meat", "SourCream", "Cheese", "Salsa");
	}

	public static void printWord(String... words) { // ---> WORKS ONLY IN METHOD
		// handle it like an ARRAY
		for (String w : words) {
			System.out.println(w);
		}

	}

	public static int sum(int... nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}
		return sum;
	}
	
	public static void cook (String name, String... ings) {
		System.out.println("Food: " + name);
		System.out.println(Arrays.toString(ings));
	}

	public static void shoppingList(int totalPrices, String...items) {
		System.out.println("Total Price: " + totalPrices);
		System.out.println("");
		
	}
}
