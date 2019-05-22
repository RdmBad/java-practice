package day25_Arrays03;
import java.util.*;
public class Population {
	public static void main(String[] args) {
		int[] population = new int[5];
		population[0] = 5000;
		population[1] = 10000;
		population[2] = 7000;
		population[3] = 4455;
		population[4] = 8907;

		System.out.println("City 0 population: " + population[0]);
		System.out.println("City 1 population: " + population[1]);
		System.out.println("City 2 population: " + population[2]);
		System.out.println("City 3 population: " + population[3]);
		System.out.println("City 4 population: " + population[4]);

		int idx = 0;
		System.out.println("City 0 population: " + population[idx]);
		
		idx++;
		System.out.println("City 0 population: " + population[idx]);
		
		String str = "abc";
		System.out.println("City STR.LENGTH population: " + population[str.length()]);
		
	//String array called Cities
		String[] cities = {"Miami", "London", "Tokyo", "Rome", "New-York"};
		System.out.println(cities[0]);
//population of Miami is 5000
		
		for(int i = 0; i < 5; i++) {
		System.out.println("Population of " + cities[i] + " is " + population[i]);
		
		}
		}
}