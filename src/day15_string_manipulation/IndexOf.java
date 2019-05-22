package day15_string_manipulation;

public class IndexOf {
	public static void main(String[] args) {
		
                      //012345		
		String word1 = "github";
		System.out.println(word1.indexOf("b")); //0
		System.out.println(word1.indexOf("th")); //2
		System.out.println(word1.indexOf("hub")); //3
		
		String url = "www.okta.com";
		int index = url.indexOf(".");
		System.out.println("Pos of . :" + index);
		System.out.println(url.charAt(index+1));   // it will give you second dot position
		
		String title = "Java - Google Search";
		//find position of '-' and check if space is on right and left sides
		int i = title.indexOf('-');  //5
		if (title.charAt(i-1) == ' ' && title.charAt(i+1) == ' ') {
			System.out.println("spaces on sides");
		}
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of states: " + states);
	
		String word2 = "java, c++, python, tomcat, eclipse";
		//check if c++ is in the word2
		//1) using contains
		if(word2.contains("c++")) {
			System.out.println("c++ is here");
		} else {
			System.out.println("c++ is not here");
		}
		//2) using IndexOf
		if (word2.indexOf("c++") > -1) {
		System.out.println("c++ is here");
		}else {
			System.out.println("c++ is not here");
		}
	}
}
