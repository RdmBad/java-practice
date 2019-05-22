package day37_array_list;

import java.util.*;

public class Shopping {
	public static void main(String[] args) {

		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("TESLA");
		shoppingList.add("Kitty");
		shoppingList.add("Ice Cream");
		shoppingList.add("squirrel");
		shoppingList.add("Nuts");
		
		// print number of items
		int count = shoppingList.size();
		System.out.println("Total count: " + count);

		// print all items in single line
		System.out.println(shoppingList.toString());
		
		// print first and last item in single line
		System.out.println(shoppingList.get(0) + " | " + shoppingList.get(count - 1));
		
		//remove
		shoppingList.remove(0);
		shoppingList.remove("Nuts");
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList);
		
		System.out.println(shoppingList.get(0));
		shoppingList.remove(0);
		
		for(String item : shoppingList) {
			System.out.println(item);
		}
		
		//remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());

	}
	
}
