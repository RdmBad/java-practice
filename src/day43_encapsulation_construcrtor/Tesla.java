package day43_encapsulation_construcrtor;

public class Tesla {
	private String model;
	private int range;
	private double zeroTo60;
	private double price;
	private boolean selfDriving;

	public void setModel(String model) {
		// call isValidMode here then assign if true
		// if false: Invalid model - Camry
		// assign "unknown" to model
		if (isValidModel(model)) {
			this.model = model;
		} else {
			System.out.println("Invalid model - " + model);
			this.model = "unknown";
		}
	}

	public String getModel() {
		return model;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getRange() {
		return range;
	}

	public void setZeroTo60(double zeroTo60) {
		this.zeroTo60 = zeroTo60;
	}

	public double getZeroTo60() {
		return zeroTo60;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setSelfDriving(boolean selfDriving) {
		this.selfDriving = selfDriving;
	}

	public boolean isSelfDriving() {
		return selfDriving;
	}

	public boolean isValidModel(String model) {
//		if (model.equalsIgnoreCase("Model S") || model.equalsIgnoreCase("Model 3") || model.equalsIgnoreCase("Model Y")
//				|| model.equalsIgnoreCase("Model X") || model.equalsIgnoreCase("Model roadster")) {
//			return true;
//		}
//		return false;
//		model = model.toLowerCase();
//		return model.equals("model s") ||
//			   model.equals("model 3") ||
//			   model.equals("model x") ||
//			   model.equals("model y") ||
//			   model.equals("model roadster");
		switch (model) {
		case "model s":
		case "model x":
		case "model y":
		case "model 3":
		case "roadster":
			return true;
		default:
			return false;
		}
	}
	
	public void setTeslaInfo (String model, int range, double zeroTo60, double price, boolean selfDriving) {
		//call setter methods for each parameter
		//this.model = model;
		setModel(model);
		setRange(range);
		setZeroTo60(zeroTo60);
		setPrice(price);
		setSelfDriving(selfDriving);
	}

	public String toString() {
		return "Tesla [model=" + model + ", range=" + range + ", zeroTo60=" + zeroTo60 + ", price=" + price
				+ ", selfDriving=" + selfDriving + "]";
	}

	
	
}
