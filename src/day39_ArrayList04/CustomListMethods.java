package day39_ArrayList04;

import java.util.*;

public class CustomListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> numsList = new ArrayList<>();
		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		printList(numsList);

		ArrayList<Double> numList1 = new ArrayList<>();
		numList1.add(10.33);
		numList1.add(10.22);
		numList1.add(7.34);
		numList1.add(8.99);
		numList1.add(8.12);
		numList1.add(3.55);
		numList1.add(4.76);
		numList1.add(8.08);
		System.out.println(sumList(numList1));
		double sum = sumList(numList1);
		System.out.println("Sum: " + sum);

		System.out.println(getList(10));
		
		System.out.println(getRandomList(10));
		
		ArrayList<Integer> rList = getRandomList(10);
		Collections.sort(rList);
		System.out.println(rList);
		
		printList(getRandomList(10));  // method inside in method
		
		List<String> strNums = new ArrayList<>();
		strNums.add("56");
		strNums.add("9");
		strNums.add("5");
		strNums.add("12");
		strNums.add("87");
		strNums.add("76");
		System.out.println(convertToIntList(strNums));
		List<Integer> converted = convertToIntList(strNums);
		System.out.println(converted);
		
	}

	public static void printList(ArrayList<Integer> nums) {
		for (Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

	public static double sumList(List<Double> dList) {
		Double sum = 0.0;
		for (Double n : dList) {
			sum += n;
		}
		return sum;
	}

	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> newList = new ArrayList<>();
		for (int i = 0; i <= size; i++) {
			newList.add(i);
		}
		return newList;
	}

	public static ArrayList<Integer> getRandomList(int size) {
		Random rand = new Random();
		ArrayList<Integer> newRandList = new ArrayList<>();
		for (int i = 1; i <= size; i++) {
			newRandList.add(rand.nextInt(101));
		}
		return newRandList;
	}
	
	public static List<Integer> convertToIntList (List<String> strList) {
		List<Integer> newList = new ArrayList<>();
		for(String str : strList) {
			newList.add(new Integer(str));
			//newList.add(Integer.parseInt(str));		second approach
		}
		return newList;
	}
}
