package day28_multi_arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
		// read all data and assign to String array

		String[] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
// 						method			   class								convert to new String Array

		System.out.println("Data size: " + data.length);

		// print first row
		System.out.println(data[0]);
		System.out.println(data[1]);

		// print last restaurant
		System.out.println(data[data.length - 1]);
		// print each restaurant information in separate lines
		int counter = 0;
		for (String rest : data) {
			System.out.println(counter + ") " + rest);
			counter++;

			// print all restaurant information in state of VA
			int count = 0;
			for (int i = 0; i < data.length; i++) {
				if (data[i].contains(",VA,")) {
					System.out.println(count + ")" + data[i]);
					count++;
				}
			}
			// print all restaurant information in state of VA
			// print the restaurant names along with cityname
			// Subway - Herndon

			for (int i = 1; i < data.length; i++) {
				if (data[i].contains(",VA,")) {
					String[] newData = data[i].split(",");

					System.out.print(newData[2] + " " + newData[1]);

				}
			}

		}
	}
}
