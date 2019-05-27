package day50_inheritance03;

public class Company {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Contractor ct = new Contractor();
		FullTimeEmployee ft = new FullTimeEmployee();

		emp1.calculatePay(40, 40);
		ft.calculatePay(40, 45);
		ct.calculatePay(40, 55);
	}
}
