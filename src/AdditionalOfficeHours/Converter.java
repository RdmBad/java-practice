package AdditionalOfficeHours;

import java.text.DecimalFormat;

public class Converter {
	public static void main(String[] args) {
		System.out.println(milesToKms(31.8));
		double km = milesToKms(85);
		System.out.println(km);
		System.out.println(multiply(4, 8));
		double litersValue = gallonsToLiters(15);
		DecimalFormat dm = new DecimalFormat("#.##"); 	// cut the result after dot dependce of count #;
		System.out.println(dm.format(litersValue));
		System.out.println(litersValue);
		System.out.println(Math.floor(litersValue)); // give only whoel part	
	}

	public static double milesToKms(double miles) {
		// double kmValue = miles * 1.609;
		double kmValue = multiply(miles, 1.609);
		return kmValue;
	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public static double gallonsToLiters(double gallon) {
		double literValue = multiply(gallon, 3.785);
		return literValue;
	}
	
}
