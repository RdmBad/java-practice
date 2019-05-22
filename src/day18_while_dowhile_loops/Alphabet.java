package day18_while_dowhile_loops;
public class Alphabet {
	public static void main(String[] args) throws InterruptedException {
		char letter = 'a';
		
		System.out.println(letter);
	while (letter <= 'z') {
		System.out.print(letter + "  ");
		letter++;
		Thread.sleep(5);
	}
	System.out.println();
	
	char capitals = 'A';
		while(capitals <= 'Z') {
			System.out.print(capitals + "  ");
			capitals++;
		}
	
	//can u print lower case in reverse
		System.out.println();
		char letter1 = 'Z';
		while (letter1 >= 'A') {
			System.out.print(letter1 + "  ");
			letter1--;
		} 
	
		System.out.println();
		char letter2 = 'z';
		while (letter2 >= 'a') {
			System.out.print(letter2 + "  ");
			letter2--;
		} 
		System.out.println();
		char myLetter = 'A';
		String letters = "";
		
		
		while (myLetter <= 'Z')  {	
			letters = letters + myLetter;
			System.out.println(letters);
			letter++;
	
		}
	
		}
		
		
		
		
	
	}
