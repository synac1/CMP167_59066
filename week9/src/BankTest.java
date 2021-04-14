
public class BankTest {
	public static void main(String[] args) {
		Bank bank1 = new Bank("Mike");
		Bank bank2 = new Bank("John");
		Bank bank3 = new Bank("Linda");
		
		//System.out.println(bank1);
		//System.out.println(bank2);
		//System.out.println(bank3);
		
		//System.out.println(Bank.accounts());
		String ownerBank1 =bank1.getName();
		
		System.out.println(ownerBank1+" deposits $500 into his account");
		bank1.deposit(500.00);
		System.out.println(ownerBank1+" withdraws $50.25 from his account");
		bank1.withdraw(50.25);
		System.out.println(ownerBank1+" checks his balance:\nthis account has a balance of:"+bank1.getBalance());
		
		System.out.println(bank3.getName()+" withdraw $500.00");
		bank3.withdraw(500.00);
		System.out.println(bank3.getName()+" checks her balance:\nthis account has a balance of:"+bank3.getBalance());
		System.out.println("__________________________________________________________________________");
		Bank [] bankAccounts = {bank1, bank2, bank3};
		printAllOwners(bankAccounts);
		
		// Test all the methods in Bank class
		// Create an array of Banks and and  
		//Create a method that prints out all the account's owners in the bank array, params: Bank array
	}
	public static void printAllOwners(Bank[] banks) {
		System.out.println("The account owners are: ");
		for(Bank b: banks) 
			System.out.println(b.getName() +" ");
	}
}
