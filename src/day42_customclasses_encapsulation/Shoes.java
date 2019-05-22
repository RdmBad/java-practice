package day42_customclasses_encapsulation;

public class Shoes {
	String brand;
	double size;

	public void setShoesData(String newBrand, double newSize) {
		brand = newBrand;
		size = newSize;
	}

	public String getShoesInfo() {
		return "Brand: " + brand + " | Size: " + size;
	}
	
	
}
