package day26_arrays04;

import java.util.*;

public class PopularNames {
	public static void main(String[] args) {
		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

		// print number of names in the array
		System.out.println("Total names: " + names.length);
		// print all names in single lines
		System.out.println(Arrays.toString(names));
		// print in column format.
		// 2 names in each lines
		for (int i = 0; i < names.length - 1; i += 2) {
			System.out.print(names[i] + ", ");
			System.out.println(names[i + 1]);
		}

		System.out.println("MALE NAMES: ");
		// print all male names
		for (int idx = 0; idx < names.length; idx += 2) {
			System.out.print(names[idx] + ", ");
		}
		System.out.println("\nFEMALE NAMES: ");
		// print all female names
		for (int q = 1; q < names.length; q++) {
			if (q % 2 != 0) {
				if (q == names.length - 1) {
					System.out.print(names[q]);
				} else {
					System.out.print(names[q] + ", ");
				}

			}
		}
		// print random name from arrays
		Random random = new Random();
		int r = random.nextInt(names.length);
		System.out.println("\nRandom name - " + names[r]);

		System.out.println();
		System.out.println("SHORT NAMES: ");
		// print all names that are up to 4 characters, in upper case, in same line
		for (String name : names) {
			if (name.length() <= 4) {

				System.out.print(name.toUpperCase() + ", ");
			}
		}
		System.out.println("\n");

		String namesUpto4 = "";
		String names5to6 = "";
		String names7orMore = "";

		for (String name : names) {
			if (name.length() <= 4) {
				namesUpto4 += name + ", ";
			} else if (name.length() == 5 || name.length() == 6) {
				names5to6 += name + ", ";
			} else {
				names7orMore += name + ", ";
			}
		}
		System.out.println("Names 3 to 4 length: " + namesUpto4.substring(0, namesUpto4.length() - 2));
		System.out.println("Names 5 to 6 length: " + names5to6.substring(0, names5to6.length() - 2));
		System.out.println("Names up to 7 : " + names7orMore.substring(0, names7orMore.length() - 2));

		// SWAP seats
		System.out.println();
		System.out.println(Arrays.toString(names));
		// CODE HERE

		for (int idx = 0; idx < names.length; idx += 2) {
			String temp = names[idx];
			names[idx] = names[idx + 1];
			names[idx+1] = temp;
		}
		System.out.println(Arrays.toString(names));
		
	}
}