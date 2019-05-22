package day46_static_keyword;

public class DinnerTest {
	public static void main(String[] args) {
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();

		System.out.println("Total slices: " + Dinner.pizzaSlices);

		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();

		System.out.println("Slices after: " + Dinner.pizzaSlices);

		System.out.println("Total slices: " + dad.pizzaSlices);

		kid.takeASlice(3);
		dad.takeASlice(2);
		mom.takeASlice();
		
		System.out.println("Total slices: " + Dinner.pizzaSlices);

		
		
	}
}
