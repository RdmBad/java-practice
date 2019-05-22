package day41_custom_classes02;

public class Kitchen {
	public static void main(String[] args) {
		Microwave micro = new Microwave();
		micro.brand = "Siemens";
		micro.turnOn();
		micro.heat("BAKLAJAN");
		micro.turnOff();
	}
}
