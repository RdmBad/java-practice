package day43_encapsulation_construcrtor;

public class TeslaDealer {
	public static void main(String[] args) {
		Tesla tesla = new Tesla();
		tesla.setModel("Model s");
		tesla.setRange(310);
		tesla.setZeroTo60(3.2);
		tesla.setPrice(51450);
		tesla.setSelfDriving(true);

		System.out.println("Model: " + tesla.getModel());
		System.out.println("Range: " + tesla.getRange() + " miles.");
		System.out.println("From 0 to 60: " + tesla.getZeroTo60() + " sec.");
		System.out.println("Price: $" + tesla.getPrice());
		System.out.println("Is it self driving? " + tesla.isSelfDriving());

		System.out.println(tesla);
		System.out.println(tesla.toString());

		Tesla myTesla = new Tesla();
		myTesla.setTeslaInfo("roadster", 620, 1.9, 250000, true);
		System.out.println(myTesla.toString());

		if (tesla.getZeroTo60() > myTesla.getZeroTo60()) {
			System.out.println("Faster model: " + myTesla.getModel());
			System.out.println("0-60 speed: " + myTesla.getZeroTo60());
		} else {
			System.out.println("Faster model: " + tesla.getModel());
			System.out.println("0-60 speed: " + tesla.getZeroTo60());
		}

		buy(myTesla);
		buy(tesla);
		System.out.println(testDrive("model s"));
		Tesla testCar = testDrive("model 3");
		System.out.println(testCar.toString());
	}

	public static void buy(Tesla car) {
		System.out.println("Purchasing: " + car.toString());
	}

	public static Tesla testDrive(String model) {
		System.out.println("Hi, I would like to test drive - " + model);
		System.out.println("Sure, let me build the object and return it");
		Tesla car = new Tesla();
		car.setTeslaInfo(model, 310, 1.9, 60000, true);
		return car;
	}
}
