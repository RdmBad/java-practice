package day29_method01;

import java.util.Arrays;

public class Countries {
	public static void main(String[] args) {
		String[][] countriesArray = { 
										{ "USA", "Washington DC" }, 
										{ "Canada", "Ottawa" }, 
										{ "Mexico", "Mexico city" },
										{ "Brasil", "Brasilia" }, 
										{ "Peru", "Lima" }, 
										{ "Argentina", "Boanes Aeros" }, 
										{ "Bolivia", "La Paz" },
										{ "Macedonia", "Scopia" }, 
										{ "Kazakhstan", "Nursultan" } 
									};

		// String [][] c = new String [9][2];
		// c[0][0] = "USA";
		// c[0][1] = "Washington DC";

		System.out.println(countriesArray[0][0] + "|" + countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + "|" + countriesArray[8][1]);
		System.out.println(Arrays.deepToString(countriesArray));
		System.out.println(countriesArray.length);
		//print all the countries in same line separated by "|"
	// 1) for loop
		for(int i = 0; i< countriesArray.length;i++) {
			System.out.print(countriesArray[i][0] + "|");
		}
		
		System.out.println();
	// 2) for each loop
		
		for(String[] country : countriesArray) {
			System.out.print(country[0] + "|");
		}
		System.out.println();
		//get all that cities  and add to cities[] array
		// declare cities array and size needs to match countries Array size
		String[] cities = new String[countriesArray.length];
		//String[] cities = new String[9];
		System.out.println(Arrays.toString(cities));  // null means no object. it is not same as empty string
		for(int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];
		}
		System.out.println(Arrays.toString(cities));

	for(int i = 0; i < countriesArray.length; i++) {
		if(countriesArray[i][0].equals("Bolivia")) {
			if(countriesArray[i][1].equals("La Paz")) {
				System.out.println("Bolivia test passed");
			}else {
				System.out.println("Bolivia test failed");
			}
			break; //exit the loop
		}
	}
	}
}
