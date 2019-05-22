package A_HomeWork;

public class ass161 {
	public static void main(String[] args) {

	}

	public double waterTax(double units) {
		double bill = 0.0;

		// your code here
		if (units > 50) {
			bill = units * 0.90;
			if (units >= 100 && units < 150) {
				bill += 50;
			} else if (units >= 150) {
				bill += 100;
			}
		} else if (units <= 50) {
			bill = units * 0.60;
		}

		// end your code here

		return bill;
	}// end waterTax

}
