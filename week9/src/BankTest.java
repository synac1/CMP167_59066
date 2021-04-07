
public class BankTest {
	public static void main(String[] args) {
		Bank bank1 = new Bank("Mike");
		Bank bank2 = new Bank("John");
		Bank bank3 = new Bank("Linda");
		
		System.out.println(bank1);
		System.out.println(bank2);
		System.out.println(bank3);
		
		System.out.println(Bank.accounts());
		// Test all the methods in Bank class
		// Create an array of Banks and and  
		//a method that prints out all the account's owners in the bank 
	}
}
