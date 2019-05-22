package A_HomeWork;
import java.util.*;
public class ass106 {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    
    //type your code below
  String[] str = sentence.split(" ");
  System.out.println(Arrays.toString(str));
  for(int i = 0; i < str.length; i++) {
	  System.out.println(str[i]);
  }
}
}
