package day43_encapsulation_construcrtor;

public class MicroCenter {
	public static void main(String[] args) {
		Computer comp1 = new Computer();
		Computer comp2 = new Computer();

		System.out.println(comp1.toString());
		System.out.println(comp2.toString());

		comp1.setBrand("ASUS strix");
		comp1.setOs("Windows 10");
		comp1.setPrice(1350);

		comp2.setBrand("Intel");
		comp2.setOs("Windows XP");
		comp2.setPrice(300);

		Computer comp3 = new Computer("iMac", "iOs", 2500);
		System.out.println(comp3.toString());
		comp3.setOs("Windows 11");
		System.out.println(comp3.toString());
		
		comp3.setPrice(comp3.getPrice()-300);
		System.out.println(comp3.toString());
		 
	}
}
