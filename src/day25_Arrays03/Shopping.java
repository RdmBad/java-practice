package day25_Arrays03;

public class Shopping {
	public static void main(String[] args) {
		String[] products = {"Timberland Shoes", "H&M Shirt", "Swatch Watch", "GUCCI Bag", "Adidas socks"};
		double[] prices = {120.0, 5.99, 150.50, 3000.5, 6.99};
		int[] itemsId = {123452, 345345, 245345, 345345, 456456};
		
		//loop though products and print each in separate line
		//print count of products
		
		System.out.println("Products count: " + products.length);
		//Check if products, prices and itemsId have some count
		
		if(products.length == prices.length && products.length == itemsId.length ) {
			System.out.println("Shopping list looks good");
		}else {
			System.out.println("Something is wrond in this list");
			return;
		}
		
		
		//loop though products and print each in separate line

		for(String prod : products) {
			System.out.println(prod);
		}
		System.out.println("_________________________________");
		//prices --> for loop
		for(int i = 0; i < prices.length; i++) {
			System.out.println(prices[i]);
		}
		// itemsId --> print it in reverse mode
		for(int k = itemsId.length-1; k >= 0; k--) {
			System.out.println(itemsId[k]);
		}
	//print a report. with a total price
	//Item 1: 12345 - Timerland Shoes - $120.0;
		//TOtal price: 
		System.out.println("______________________________");
		double totalPrice = 0;
		
		
		for(int idx = 0; idx < products.length; idx++) {
			
			System.out.println("Item " + (idx+1) + ": " + itemsId[idx] + " - " + products[idx] + " - $" + prices[idx]);
			totalPrice += prices[idx];
			
		}
		System.out.println("Total price: " + totalPrice);
	//print the most expensive item in your list and print it is a report
		//loop and find. Do not use Arrays class

		System.out.println("____________________________________");
		int maxIndex = 0;
		double maxPrice = 0;
		
		for(int q = 0; q < prices.length; q++) {
			if(prices[q] > maxPrice) {
				maxPrice = prices[q];
				maxIndex = q;
				}
			
			
		}
	System.out.println(itemsId[maxIndex] + " - " + products[maxIndex] + " - $" + maxPrice);	
	}
}
