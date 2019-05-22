package day41_custom_classes02;

public class BankAccount {
	double balance;
	String accountHolder;
	int accountNumber;

	public void deposit(double amount) {
		System.out.println("Depositing $" + amount + " to " + accountNumber);
		balance += amount;
	}

	public void withdraw(double amount) {
		System.out.println("Withdrawing $" + amount + " from " + accountNumber);
		balance -= amount;
		if (balance < 0) {
			balance -= 35;
		}
	}
	
	public void showBalance() {
		System.out.println("==============================");
		System.out.println("Account holder: " + accountHolder);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Balance: $" + balance);
		System.out.println("==============================");
	}
	public void charge(double price, String item) {
		
		if(balance >= price) {
			balance -= price;
			System.out.println("Thank you.! Order placed " + item + ". balance $" + balance);
		}else {
			System.out.println("Not enough minerals my LORD");
		}
	}
	
}
