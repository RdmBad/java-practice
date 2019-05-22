package day41_custom_classes02;

public class MyCars {
public static void main(String[] args) {
	Car buggy = new Car();
	buggy.make = "TESLA";
	buggy.model = "X";
	buggy.currentSpeed = 90;
	buggy.color = "White";

	buggy.printCarInfo();
	buggy.showCurrentSpeed(45);
	
	
	buggy.accellerate(10);
	System.out.println("After accelerate : " + buggy.currentSpeed);

	BMW bmw = new BMW();
	System.out.println(bmw.make);
	bmw.model = "740i";
	bmw.showPrice();
	
	BMW bmw2 = new BMW();
	bmw2.model = "X3";
	bmw2.showPrice();
	
}
}
