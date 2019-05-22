package day41_custom_classes02;

public class Microwave {
	String brand;
	boolean isOn;

	public void turnOn() {
		if (isOn == true) {
			System.out.println(brand + " microwave is already on");
		} else {
			System.out.println("Turning on...." + brand + " microwave");
			isOn = true;
		}
	}

	public void turnOff() {
		if (isOn == false) {
			System.out.println(brand + "microwave is already off");
		} else {
			System.out.println("Turning off...." + brand + " microwave");
			isOn = false;
		}
	}

	public void heat(String food) {
		if (isOn == true) {
			System.out.println("Heating the pizza with " + food);
		} else {
			System.out.println("Microwave is OFF, cannot heat pizza");
		}
	}

}
