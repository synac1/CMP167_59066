
public class Bank {
	private double balance;
	private String name;
	private int accoutNumber;
	private static int amountOfAccounts;
	
	public Bank(String name) {
		this.name = name;
		this.balance = 0.0;
		this.accoutNumber = ++amountOfAccounts;
	}
	public double getBalance() {
		return balance;
	}
	public String getName() {
		return name;
	}
	public void withdraw (double amount) {
		if(balance-amount < 0) {
			System.out.println("The amount exceeds the balance");
		}
		else {
			this.balance -= amount;	
		}
	}
	public void deposit(double amount ) {
		if (amount < 0) {
			System.out.println("Cannot deposit a negative value");
		}
		else{
			this.balance += amount;
		}
	}
	public static int accounts() {
		return amountOfAccounts;
	}
	
	@Override
	public String toString() {
		
		return "Bank \nname: "+this.name + " ,\nbalance: "+getBalance() +" ,\naccountNumber: "+this.accoutNumber;
	}
}
