package hw12B;

/**
 * A bank account has a balance that can be changed by 
 * deposits and withdrawals 
 *
 */
public class BankAccount
{  
    private double balance;
    private String accountId;
    public final static double MINIMUM_BALANCE = 1500;
    public final static double BELOW_MINIMUM_FEE = 10.0;

    /**
     * Constructs a bank account with a given balance.
     * @param initialBalance the initial balance
     * @param id the id for this account
     */
    public BankAccount(double initialBalance, String id)
    {   
        balance = initialBalance;
        accountId = id;
    }

    /**
     * Gets the id for this account
     * @returns the id for this account
     */
    public String getAccountId()
    {
        return accountId;
    }

    /**
       Deposits money into the bank account.
       @param amount the amount to deposit
     */
    public void deposit(double amount)
    {  
        balance = balance + amount;
    }

    /**
       Withdraws money from the bank account.
       @param amount the amount to withdraw
     */
    public void withdraw(double amount)
    {   
        balance = balance - amount;
    }

    /**
       Gets the current balance of the bank account.
       @return the current balance
     */
    public double getBalance()
    {   
        return balance;
    }

    /**
     * Do end of month processing for the account
     */
    public void endOfMonth()
    {
        if (balance < MINIMUM_BALANCE)
        {
            balance = balance - BELOW_MINIMUM_FEE;
        }
    }
    public String toString() {
    	String temp = "";
    	if(getClass().equals((new BankAccount(0, null)).getClass())){
    		temp += "BankAccount";
    	}
    	else if(getClass().equals((new NewWorldAccount(0, null, 0)).getClass())){
    		temp += "NewWorldAccount";
    	}
    	temp += "[balance=" + balance + ",accountId=" + accountId +"]";
    	return temp;   	
    }
    
    public boolean equals(Object otherObject) {
    	if(otherObject instanceof NewWorldAccount && this instanceof NewWorldAccount || !(otherObject instanceof NewWorldAccount) && !(this instanceof NewWorldAccount)) {
    		BankAccount other = (BankAccount)otherObject;	
    		if(other.getBalance()==balance && other.getAccountId().equals(accountId)){
    			return true;
    		}
    	}
    	
    	return false;
    }
}