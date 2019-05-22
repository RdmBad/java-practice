package day46_static_keyword;

public class eBay {
	public static void main(String[] args) {
		Customer cm1 = new Customer("frodo", "hobbitfromshere@gmail.com");
		Customer cm2 = new Customer("Kate spade", "kate1991@gmail.com");
		Customer cm3 = new Customer("ADILET", "erkekshe@gmail.com");

		System.out.println(cm3.count);
		System.out.println(Customer.count);

		Customer cm4 = new Customer("Arnold Shwarz", "arny@gmail.com");
		System.out.println("Total customers: " + Customer.count);

		cm1.count = 10;
		System.out.println(cm3.count);
		System.out.println(Customer.count);
		
		
		
		
		


	}
}
