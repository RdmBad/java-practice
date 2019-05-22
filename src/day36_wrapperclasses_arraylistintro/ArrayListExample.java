package day36_wrapperclasses_arraylistintro;
import java.util.*;
public class ArrayListExample {
public static void main(String[] args) {
	
	// declare arraylist called languages
	ArrayList<String> languages = new ArrayList<>();
	languages.add("russian");
	languages.add("java");
	languages.add("buryaadar");
	languages.add("latin");
	
	System.out.println("Number of values: " + languages.size());
	languages.remove(0);
	System.out.println("Number of values: " + languages.size());
	
	System.out.println(languages.toString());
}
}
