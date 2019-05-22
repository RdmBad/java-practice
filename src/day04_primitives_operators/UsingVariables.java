package day04_primitives_operators;

public class UsingVariables {
	public static void main(String[] args) {
		//declare int variables num1 , num2 , num3
		int num1, num2 , num3;
		
		//assign 100 to num1
		num1 = 100;
		//assign value of num1 to num2
		num2 = num1;
		//Print num1 and num2 values in separate lines
		System.out.println(num1);
		System.out.println(num2);
	
		//declare apples and assign 25
		int apples = 25;
		
		//declare kiwis and assign value of apples to it
		int kiwis = apples;
		
		//declare mangos and assign 55
		int mangoes = 55;
		
		//assign mangoes to kiwis
		
		mangoes = kiwis;
		
		System.out.println(apples);
		System.out.println(kiwis);
		System.out.println(mangoes);
	}
}
