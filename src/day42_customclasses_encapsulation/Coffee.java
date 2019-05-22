package day42_customclasses_encapsulation;

public class Coffee {
	String name;
	String size;
	double price;
	int calories;

	public void getCoffeeInfo() {
		System.out.println(name.toUpperCase() + " | " + size.toUpperCase() + "(size) | " + calories + "cal. | $" + price);
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setSize(String newSize) {
		if (newSize.equalsIgnoreCase("tall") || newSize.equalsIgnoreCase("grande")
				|| newSize.equalsIgnoreCase("venti")) {
			size = newSize;
		} else {
			System.out.println("ERROR: incorrect size" + newSize);
		}
	}

	public void setPrice(Double newPrice) {
		price = newPrice;
	}

	public void setCalories(int newCal) {
		calories = newCal;
	}
	public void setCoffeeInfo(String newName, String newSize, Double newPrice, int newCal) {
		setName(newName);
		setSize(newSize);
		setPrice(newPrice);
		setCalories(newCal);
	}

}
