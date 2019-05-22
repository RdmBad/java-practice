package day20_forloop;
import java.util.*;
public class ZombieAttack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many inhabitants: ");
		int inhabitants = scan.nextInt();
	    int day = 0;
	  
	    while(inhabitants > 0) {  
	      if (inhabitants == 0) {
	        System.out.println("---- EXTINCT ----");
	      }
	    System.out.println("Day " + day + " [" + inhabitants + "]");
	    inhabitants = inhabitants / 2;
	    day++;
	    }

	    System.out.println("---- EXTINCT ----");
	} 
	  
	}

