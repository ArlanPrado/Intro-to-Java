package hw11B;

/**
 * Tester for BankAccount and its subclasses
 */
public class AccountTester
{
	public static void main(String[] args)
	{
		//StudentAccount testing

		//check that StudentAccount is subclasses of BankAccount
		BankAccount account = new StudentAccount(1500, "abc123");

		account.endOfMonth();
		System.out.println("No transactions: " + account.getBalance());
		System.out.println("Expected: 1500.0");

		// withdraw one more than max times
		for (int i = 0; i < StudentAccount.FREE_TRANSACTIONS + 1; i++)
		{
			account.withdraw(1);
		}
		
		System.out.println("Before end of month: " + account.getBalance());
		System.out.println("Expected: 1494.0");
		account.endOfMonth();
		System.out.println("Too many transactions: " + account.getBalance());
		System.out.println("Expected: 1491.0");

		//a couple of more transactions
		account.deposit(2.0);
		account.deposit(2.0);
		System.out.println("Before end of month: " + account.getBalance());
		System.out.println("Expected: 1495.0");

		account.endOfMonth();
		System.out.println("After end of month: " + account.getBalance());
		System.out.println("Expected: 1495.0");

		// NewWorldAccount testing

		//check that NewWorldAccount is subclasses of BankAccount

		account = new NewWorldAccount(1000, "abc123", 12);
		
       System.out.println("Time to maturity: " + ((NewWorldAccount)account).getTimeToMaturity());
       System.out.println("Expected: 12");

		for (int i = 0; i < 12; i++)
		{
			account.endOfMonth();
		}
		
		System.out.println("Time to maturity: " + ((NewWorldAccount)account).getTimeToMaturity());
	    System.out.println("Expected: 0");
		System.out.printf("Amount at maturity: %.2f%n" , account.getBalance()); 
		System.out.println("Expected: 1011.06");

		account.withdraw(100);
		System.out.printf("Withdraw after maturity: %.2f%n" , account.getBalance()); 
		System.out.println("Expected: 911.06");

		System.out.println("NEW ACCOUNT");
		account = new NewWorldAccount(1000, "xyz789", 36);
		account.endOfMonth();
		account.withdraw(100);
		System.out.println("Time to maturity: " + ((NewWorldAccount)account).getTimeToMaturity());
	    System.out.println("Expected: 35");
		System.out.printf("Withdraw before maturity: %.2f%n" , account.getBalance()); 
		System.out.println("Expected: 880.92");
		
		for (int i = 0; i < 39; i++)
		{
			account.endOfMonth();
		}
		
		System.out.printf("40 month's balance: %.2f%n" , account.getBalance()); 
		System.out.println("Expected: 912.96");
		account.withdraw(100);
		System.out.printf("Withdraw after maturity: %.2f%n" , account.getBalance()); 
		System.out.println("Expected: 812.96");
		

	}
}