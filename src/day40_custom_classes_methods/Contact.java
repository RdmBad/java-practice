package day40_custom_classes_methods;

public class Contact {
	String name;
	String phoneNumber;
	String email;

	// behavior | instance methods
	public void call() {
		System.out.println("Calling " + name + " .... ");
	}

	public void sendMessage() {
		System.out.println("Sending a message to " + phoneNumber + " | name: " + name + " .... ");
	}

	public void sendEmail() {
		System.out.println("Sending email to " + email + " .... ");
	}
}
