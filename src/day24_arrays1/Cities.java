package day24_arrays1;
import java.util.*;
public class Cities {
	public static void main(String[] args) {
		
		String[] cities = {"Washington D.C.", "Annandale", "Kiev", "Moscow", "Istanbul", "Baku", "Ulan-Ude", "Miami", "McLean"};
		System.out.println(cities.length);
	//Print all cities that starts with M
	
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
			// same thing with for each loop
		for(String city: cities) {
			if(city.startsWith("M")) {
				System.out.println(city);
			}
		}
		
		
		
	}
}
