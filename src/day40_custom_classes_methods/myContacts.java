package day40_custom_classes_methods;

public class myContacts {
	public static void main(String[] args) {
		// create Contact object
		Contact contact1 = new Contact();
		contact1.name = "Evgenia Jalilova";
		contact1.phoneNumber = "(202) 333-4444";
		contact1.email = "Evgenia@thorlabs.com";

		contact1.call();
		contact1.sendMessage();
		contact1.sendEmail();

		Contact buran = new Contact();
		buran.name = "Buran";
		buran.phoneNumber = "3012 43-58-67";
		buran.email = "BestPet@gmail.com";

		System.out.println("Name: " + buran.name);
		System.out.println("PhoneNumber: " + buran.phoneNumber);
		System.out.println("Email: " + buran.email);

		buran.call();
		buran.sendMessage();
		buran.sendEmail();

		contact1.call();

		
	}
}
