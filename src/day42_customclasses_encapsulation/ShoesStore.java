package day42_customclasses_encapsulation;

import java.util.*;

public class ShoesStore {
	public static void main(String[] args) {
		Shoes shoe1 = new Shoes();
		shoe1.setShoesData("ALDO", 8.5);

		Shoes shoe2 = new Shoes();
		shoe2.setShoesData("BOSS", 9.5);

		Shoes shoe3 = new Shoes();
		shoe3.setShoesData("ADIDAS", 7.5);

		Shoes[] shoesArray = new Shoes[3];
		shoesArray[0] = shoe1;
		shoesArray[1] = shoe2;
		shoesArray[2] = shoe3;

		System.out.println(shoesArray[0].getShoesInfo());
		System.out.println(shoesArray[1].getShoesInfo());
		System.out.println(shoesArray[2].getShoesInfo());

		System.out.println(shoesArray[0].brand);
		System.out.println(shoesArray[1].brand);
		System.out.println(shoesArray[2].brand);

		System.out.println("==============================================");
		
		// ArrayList of Shoes
		ArrayList<Shoes> myShoes = new ArrayList<>();
		myShoes.add(shoe1);
		myShoes.add(shoe2);
		myShoes.add(shoe3);

		System.out.println(myShoes.get(0).getShoesInfo());
		System.out.println(myShoes.get(1).getShoesInfo());
		System.out.println(myShoes.get(2).getShoesInfo());

		System.out.println(myShoes.get(0).size);
		System.out.println(myShoes.get(1).size);
		System.out.println(myShoes.get(2).size);

		Shoes redShoes = myShoes.get(1); 					// ASSIGN TO VARIABLE SHOULD BE MATCH WITH THE CLASS NAME.
		System.out.println(redShoes.getShoesInfo());
	
		System.out.println("==============================================");
		
		for(Shoes shoe : myShoes) {
			System.out.println(shoe.getShoesInfo());
		}
		
		System.out.println("==============================================");
		
		//print name of Shoes in the list that size is more than 8
		for(Shoes shoe : myShoes) {
			if(shoe.size > 8.0) {
				System.out.println(shoe.getShoesInfo());
			}
		}
		
		
	}
}
