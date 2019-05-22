package day28_multi_arrays;

import java.util.Arrays;

public class Loop2DArrays {
	public static void main(String[] args) {
		String[][] pizzas = { { "pineapple", "pepperoni" }, // 0
				{ "anchovies", "mushroom", "olives" }, // 1
				{ "4 cheese" }, // 2
				{ "chicken", "tomatoes", " japalenios", "onions" }, // 3
				{ "green peppers", "zuccini", "brocolli", "spinach", "shrimp" } // 4
		};

		System.out.println(Arrays.toString(pizzas[0]));

		for (String[] pizza : pizzas) {
			System.out.print(pizza.length + " - ");
			System.out.println(Arrays.toString(pizza));
		}

		System.out.println("----------------------------------------------------------");

		for (int i = 0; i < pizzas.length; i++) {
			System.out.println(pizzas[i].length + " - " + Arrays.toString(pizzas[i]));
		}

		System.out.println("-----------------------------------------------------------");
		for (String topping : pizzas[0]) { // print all values in 0 array
			System.out.println(topping);
		}

		int[][] students = { { 4, 5, 6 }, { 12, 5, 7 }, { 23, 55, 12, 55, 3 } };
		// 2 parts: outer loop, inner loop
		// outer loop will take each group
		// inner loop will take each value/student id

		for (int[] group : students) {
			for (int studentId : group) {
				System.out.print(studentId + ", ");
			}
			System.out.println();
		}

		int[][] nums = { 
						{ 10, 20 },	//0 
						{ 20, 30, 40, 50 },	//1 
						{ 100, 200, 400 }, 	//2
						{ 555, 333, 111, 444, 666, 78 }	//3
						};
	for(int i = 0; i < nums.length; i++) {
		for(int j = 0; j < nums[i].length; j++) {
			System.out.print(nums[i][j] + " ");
		}
	System.out.println();
	}
	
	}
}
