package day49_inheritance02;

//  Factory is a Non-Subclass
public class Factory {
	public static void main(String[] args) {
		Device dev = new Device();
		dev.brand = "LG";
		dev.model = "3300";
		dev.price = 1000;
		//dev.country ="USA";		not visible
	}
}
