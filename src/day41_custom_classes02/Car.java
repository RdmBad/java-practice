package day41_custom_classes02;

public class Car {
	String make;
	String model;
	int currentSpeed;
	String color;

	public void printCarInfo() {
		System.out.println("Car make [" + make + "], model [" + model + "], color [" + color + "], currentSpeed ["
				+ currentSpeed + "]");
	}

	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed <= speedLimit) {
			System.out.println("Keep moving maaaan");
		} else {
			System.out.println("Slow down BRO");
		}
	}
	
	public void accellerate (int mph) {
		currentSpeed += mph;
	}
	
	
} 







//1 2 4 8 16 32 64 128