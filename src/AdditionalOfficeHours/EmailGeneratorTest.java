package AdditionalOfficeHours;

public class EmailGeneratorTest {
	public static void main(String[] args) {
		EmailGenerator e1 = new EmailGenerator("Roman");
		
		System.out.println(e1.getEmail());
		
		EmailGenerator e2 = new EmailGenerator("Florian");
		System.out.println(e2.getEmail());
	}
}
