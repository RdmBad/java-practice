package day13_ternary_string_intro;

public class MoreTernary {
	public static void main(String[] args) {
		String quality = "bad";
		int rating = (quality.equals("good")) ? 100 : 0;
		System.out.println("Rating is " + rating);
		
		int PMHour = 6;
		// Rush hour during afternoon: 4 - 7
		boolean rushHour = (PMHour >= 4 && PMHour <=7) ? true : false;
		//System.out.println(PMHour + " is rush hour? " + rushHour);
		//rushHour ==> true - yes
		//rushHour ==> false - no
				
		String result = rushHour==true ? "yes" : "no"; 
		System.out.println(PMHour + " is rush hour? - " + result);
		
		int AMHour = 8; //6-9
		String amRushHour = (AMHour>=6 && AMHour <=9) ? "Yes" : "No";
		System.out.println(AMHour + " is rush hour? - " + amRushHour);
	}
}
