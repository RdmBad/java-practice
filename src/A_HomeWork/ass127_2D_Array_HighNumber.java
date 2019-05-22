package A_HomeWork;

import java.util.*;

public class ass127_2D_Array_HighNumber {
public static void main(String[] args) {
	  
	int[][] arr = {{1,2,3,4,5},{9,8,7,6}};
	    
	    //TODO write your code below
	int high = 0;
    high = arr[0][0];
    for(int i = 0; i < arr[i].length; i++) {
          if(high < arr[i][i]) {
          high = arr[i][i];
          
        }    
      }
      System.out.println(high);
    System.out.println(high);
	    
	    
	    
   
	  }//end main
}
