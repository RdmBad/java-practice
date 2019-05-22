package day41_custom_classes02;
import java.util.*;
public class WarmUpWithList {
public static void main(String[] args) {
	ArrayList<Integer> List = new ArrayList<>();
	List.add(3);
	List.add(5);
	List.add(4);
	List.add(8);
	List.add(7);
	List.add(2);
	
	System.out.println(DoubleTheList(List));
	
	
}

public static List<Integer> DoubleTheList (ArrayList<Integer> nums) {
	Integer num = 0;
	for(int i = 0; i < nums.size(); i++) {;
		nums.set(i, nums.get(i)*2);
	}
	return nums;
}
}
