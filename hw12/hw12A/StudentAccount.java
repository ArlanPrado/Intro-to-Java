package hw12A;

/**StudentAccount that is a subclass of BankAccount
 * No minimum balance but has charges if free transactions are limit
 * @author arlan
 *
 */
public class StudentAccount extends BankAccount{
	public final static double MINIMUM_BALANCE = 0;
	public final static double CHARGE_OVER_FREE_TRANS = 3;
	public final static int FREE_TRANSACTIONS = 5;
	private int freeTransactions;
	private int charges;
	
	/**StudentAccount constructor that calls the BankAccount constructor and initializes the free transactions and charges
	 * 
	 * @param balance The Balance to start off with
	 * @param id The id of the account
	 */
	public StudentAccount(double balance, String id) {
		super(balance,id);
		freeTransactions = FREE_TRANSACTIONS;
		charges = 0;
	}
	@Override
	/**
	 * subtracts free transaction count, if free transaction is 0 then charge the account
	 * @param amount Amount to deposit
	 */
	public void deposit(double amount) {
		if(freeTransactions != 0)
			freeTransactions--;
		else if(freeTransactions <= 0)
			charges += CHARGE_OVER_FREE_TRANS;
		super.deposit(amount);
	}
	@Override
	/**
	 * subtracts free transaction count, if free transaction is 0 then charge the account
	 * @param amount to withdraw
	 */
	public void withdraw(double amount) {
		if(freeTransactions != 0)
			freeTransactions--;
		else if(freeTransactions <= 0)
			charges += CHARGE_OVER_FREE_TRANS;
		super.withdraw(amount);
	}
	@Override
	/**
	 * withdraws the account automatically by the amount of charges
	 */
	public void endOfMonth() {
		super.withdraw(charges);
		freeTransactions = FREE_TRANSACTIONS;
		charges = 0;
	}
}
