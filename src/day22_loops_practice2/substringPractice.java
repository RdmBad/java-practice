package day22_loops_practice2;

public class substringPractice {
	public static void main(String[] args) {
		String word = "java";
		System.out.println(word.substring(0, 2)); //ja
		
		//print each character in separate line using substring
		
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3));
		
		System.out.println("_________________________________________");
		int i = 0;
		System.out.println(word.substring(i, i+1));
		i++;
		System.out.println(word.substring(i, i+1));
		i++;
		System.out.println(word.substring(i, i+1));
		i++;
		System.out.println(word.substring(i, i+1));
	System.out.println("______________________________________________");
		for(int n = 0; n <= 3; n++) {
			System.out.println(word.substring(n, n+1));
		}
		System.out.println("### REVERSE ###");
		
		for(int j = 3; j >= 0; j--) {
			String letter = word.substring(j, j+1); 
			System.out.println(letter);
		}
		
	int start = 1;
	int end = 10;
				  //01234567891011
	String word2 = "UnitedStates";
	System.out.println(word2.substring(start,end));
	
	
	}
}
