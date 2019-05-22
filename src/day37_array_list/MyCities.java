package day37_array_list;

import java.util.*;

public class MyCities {
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Ulan-Ude");
		cities.add("Miami");
		cities.add("Los-Angeles");
		cities.add("Honolulu");
		cities.add("Anchorige");
		cities.add("Vladivostok");

		// print each city using for each loop separated by space
		for (String town : cities) {
			System.out.print(town + " ");
		}

		// print each city using for loop, separated by space
		System.out.println();
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " ");
		}
		//remove Honolulu
		cities.remove("Honolulu");
		System.out.println(cities.toString());
		
		
		//isEmpty?
		System.out.println("Is lisst empty? " + cities.isEmpty());
		cities.add(0, "Bishkek");
		
		System.out.println(cities.toString());
		cities.add(1, "Istanbul");
		System.out.println(cities.toString());

		cities.set(1, "Seoul");
		System.out.println(cities.toString());
	// fint miami in the list and give the index
		int idx = cities.indexOf("Miami");
		System.out.println("Miami index is " + idx);
		cities.set(idx, "Agroba");
		System.out.println(cities.toString());
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println(empty);
	}


}
