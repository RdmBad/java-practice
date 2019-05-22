package day15_string_manipulation;
import java.util.*;
public class WarmUpEmoji {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String emoji = scan.next();
		if(emoji.length() != 2) {
			System.out.println("Invalid emoji");
			return;		//stop execution
		}
	
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first == ':') {	
		 	if (second == ')') {
		 		System.out.println("smile");
		 	}else if (second == '(') {
		 		System.out.println("sad");
		 	}else if (second == '/') {
		 		System.out.println("upset");
		 	}else if (second == 'p') {
		 		System.out.println("playful");
		 	}else {
		 		System.out.println("Unknown emoji");
		 	}
		 	
		 }else if (first == ';') {
			 if (second == ')') {
				 System.out.println("wink");
			 }else if (second == '0') {
				 System.out.println("surprised");
			 }else {
				 System.out.println("Unknown emoji");
			 }
		 }else if (first == '(') {
			 if (second == ':') {
				 System.out.println("smile"); 
			 }else {
				 System.out.println("Unknown emoji");
			 }
		 }else if (first == ')') {
			 if (second == ':') {
				 System.out.println("sad");
			 }else {
				 System.out.println("Unknown emoji");
			 }
		 }else {
			 System.out.println("Invalid emoji");
		 }
}
}


