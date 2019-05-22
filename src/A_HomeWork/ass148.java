package A_HomeWork;

import java.util.*;

public class ass148 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("enter number");
		int num = inp.nextInt();
next3(num);
	}

	public static void next3(int num) {
    num=num+1;
		for(int i = 0; i < 3; i++) {
    	System.out.print(num++ + " ");
    }
    
  }

}