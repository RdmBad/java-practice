package day45_encapsulation_practice;

public class EtsyDotCom {
	public static void main(String[] args) {
		EtsyAccount acc1 = new EtsyAccount();
		System.out.println(acc1.toString());
		acc1.setEmail("nanoimma@gmail.com");
		acc1.setFirstName("AigErim");
		acc1.setPassword("sddfgf123");
		System.out.println(acc1.toString());

		EtsyAccount acc2 = new EtsyAccount();
		acc2.setEmail("skdfskdfgmail.com");
		acc2.setFirstName("skdeva123");
		acc2.setPassword("abc13");
		System.out.println(acc2.toString());

		EtsyAccount acc3 = new EtsyAccount("sdfsdfk@gmail.com", "sdfsdfk", "sdfsdk1234");
		System.out.println(acc3.toString());

		EtsyAccount acc4 = new EtsyAccount("gobajo@gmail.com", "gobajo");
		System.out.println(acc4.toString());
		
		final String password = "me2fsd";
		//password = "abc123";
	}
}
