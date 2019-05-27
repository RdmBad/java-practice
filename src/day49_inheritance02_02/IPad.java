package day49_inheritance02_02;

import day49_inheritance02.*;

public class IPad extends Device {
	public void readEBook(String title) {
		System.out.println("Reading a book " + title + " using " + brand + " tablet");
		System.out.println("Model: " + model);
		// System.out.println("Price: " + price); 										not inherited, not visible
		//System.out.println("made in " + country);			not visible
	}
}
