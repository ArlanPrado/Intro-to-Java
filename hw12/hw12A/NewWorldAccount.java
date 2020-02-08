package hw12A;

/**NewWorldAccount subclass of BankAccount, an investment account that accrues money over time
 * 
 * @author arlan
 *
 */
public class NewWorldAccount extends BankAccount{
	private int maturity;
	public final static double INTEREST = .011 / 12;
	public final static double WITHDRAWAL_PENALTY = 0.2;
	
	/**Constructor that calls the superclass and 
	 * 
	 * @param balance Initial Balance
	 * @param id Id of account
	 * @param maturity Months till maturity
	 */
	public NewWorldAccount(double balance, String id, int maturity) {
		super(balance, id);
		this.maturity = maturity;
	}
	@Override
	/**
	 * @param amount Amount to deposit
	 */
	public void deposit(double amount) {
		super.deposit(amount);
	}
	@Override
	/**
	 * Adds a withdrawal penalty if the maturity is not met
	 * @param amount to withdraw
	 */
	public void withdraw(double amount) {
		if(maturity > 0) 
			amount = amount + amount*WITHDRAWAL_PENALTY;
		super.withdraw(amount);
	}
	@Override
	/**
	 * reduces the maturity and adds interest
	 */
	public void endOfMonth() {
		maturity--;
		double cpdInterest = super.getBalance()*INTEREST;
		super.deposit(cpdInterest);
	}
	
	/**Returns the time until the account matures
	 * 
	 * @return maturity
	 */
	public int getTimeToMaturity() {
		return maturity;
	}
}
