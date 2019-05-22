package day16_string_manipulation;
import java.util.*;
public class Url {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter url:");
		String url = scan.next();
		
		//check www.
		if(url.startsWith("www.")) {
			System.out.println("www. is present");
		}else {
			System.out.println("Invalid url format");
			return;
		}
	
		//check . is there right before extension
		//find out the length of the url
		//do -4 and using charAt get the character
		//compare if it is '.'
		
		int dotIndex = url.length() -4;
		//url.lastIndexOf('.');
		if (url.charAt(dotIndex) == '.') {
			System.out.println(". is there before extension");
		}else {
			System.out.println(". might be misplaced");
		}
		/*
		 if(url.charAt(url.length() -4) == '.' {
		 }
		  
		 */
	
		//get domain and extension
		//www.yahoo.com
		String domain = url.substring(4, dotIndex);
		System.out.println(domain);
		String extension = url.substring(dotIndex+1, url.length());
		//String extension = url.substring(dotIndex+1);
		System.out.println("Extension: " + extension);
	}
}
