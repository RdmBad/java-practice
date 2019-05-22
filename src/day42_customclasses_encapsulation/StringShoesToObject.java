package day42_customclasses_encapsulation;

import java.util.*;

public class StringShoesToObject {
	public static void main(String[] args) {
		String data = "Bruno Magli,9.5";
		String[] arrData = data.split(",");

		Shoes shoe4 = new Shoes();
		// shoe4.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		shoe4.brand = arrData[0];
		shoe4.size = Double.parseDouble(arrData[1]);
		System.out.println(shoe4.getShoesInfo());

		Scanner scan = new Scanner(System.in);
		System.out.println("What shoes brand?");
		String brand = scan.next();
		System.out.println("What is your size?");
		Double size = scan.nextDouble();

		Shoes shoe5 = new Shoes();
		// shoe5.brand = brand;
		// shoe5.size = size;
		shoe5.setShoesData(brand, size);
		System.out.println(shoe5.getShoesInfo());

	}
}
