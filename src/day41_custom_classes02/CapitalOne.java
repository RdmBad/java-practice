package day41_custom_classes02;

public class CapitalOne {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		bank.accountHolder = "Lenin";
		bank.accountNumber = 12312313;
		bank.deposit(250);
		bank.withdraw(100);
		bank.showBalance();
		bank.charge(50, "HBO");
		bank.showBalance();
		bank.charge(56740, "Mercedes AMG");
		
		
		
	}
}
