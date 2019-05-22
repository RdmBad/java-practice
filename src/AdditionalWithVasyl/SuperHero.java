package AdditionalWithVasyl;

import java.util.Arrays;

public class SuperHero {
	public static void main(String[] args) {
		String[] arr1 = { "word" };
		String[] arr2 = new String[2];
		String[] arr3 = new String[] { "apple", "kiwi" };
		arr2[0] = "word";
		arr2[0] = "new word";
		arr2[1] = "one more new word";
		// array is not resizeable
		System.out.println(Arrays.toString(arr2));

		String[] superheroes = { "Spiderman", "Iron Man", "Hulk", "Wonder Woman", "Thor", "Batman", "Hellboy",
				"Superman", "Flash", "Captain America", "Ant-Man", "Aquaman" };

		// how many super heroes we have with apse in the name
		int count = 0;
		String namesWithSp = "";
		for (String each : superheroes) {
			if (each.contains(" ")) {
				count++;
				namesWithSp += each + ", ";
			}
		}
		System.out.println("Names with the space: " + count);
		System.out.println(namesWithSp.substring(0, namesWithSp.length() - 2));

		String[] newHeroes = namesWithSp.split(", ");
		System.out.println(Arrays.toString(newHeroes));
	}
}
