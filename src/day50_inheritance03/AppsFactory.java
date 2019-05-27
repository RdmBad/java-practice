package day50_inheritance03;

public class AppsFactory {
	public static void main(String[] args) {

		IPhoneApp iApp = new IPhoneApp();
		IPhoneApp iApp2 = new IPhoneApp("Uber");

		AndroidApp AApp = new AndroidApp();
		AndroidApp AApp2 = new AndroidApp("Lift");

		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());

		System.out.println(AApp.getName());
		System.out.println(AApp2.getName());

		App.count = 33;
		System.out.println(IPhoneApp.count);
		AndroidApp.count = 100;
		System.out.println("App. count: " + AndroidApp.count);

		App.build("swift");
		IPhoneApp.build("Objective C");
		AndroidApp.build("Java");
		AApp2.build("JS");
		
		
		
	}
}