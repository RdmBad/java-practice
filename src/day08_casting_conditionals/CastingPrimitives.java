package day08_casting_conditionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		//cast double value to int
		int i =(int)3.4;
		System.out.println("i: " + i);
		
		double price = 230.50;
		int dollars = (int)price;
		System.out.println("Price: " + price);
		System.out.println("Dollars: " + dollars);
				
		//WHOLE NUMBERS. byte, short, int
		
		int count = 44;
		byte byteCount = (byte)count;
		System.out.println("byteCount: " + byteCount);
		
		long longValue = 34545346L;
		int intValue = (int)longValue;
		System.out.println("IntValue: " + intValue); 
		
		int large = 5687;
		short small = (short) large;
		System.out.println("small: " + small);
		
		   //250     //250       /250.2
		int result = (int)(500.4 / 2.0);
		System.out.println("Result: " + result);
		
		byte b = 123;
		int p = b;      // it will be automatically cast it.
						// no need to put (int). 
						// (int) will ALSO work
		
		
		
		
	}
}
