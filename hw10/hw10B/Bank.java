package hw10B;

import java.util.ArrayList;
/**Bank class that holds and manipulates an ArrayList of BankAccount objects
 * 
 * @author arlan
 *
 */
public class Bank {
	ArrayList<BankAccount> accounts;
	/**Bank constructor that initializes the Bank ArrayList
	 * 
	 */
	public Bank() {
		accounts = new ArrayList<BankAccount>();
	}
	
	/**Adds a new account to the bank
	 * 
	 * @param newAcc The new account to be added to the ArrayList
	 */
	public void add(BankAccount newAcc) {
		accounts.add(newAcc);
	}
	
	/**Puts the largest account to the first index of the ArrayList
	 * 
	 */
	public void largestFirst() {
		if(!accounts.isEmpty()) {
			BankAccount largest = accounts.get(0);
			int largestAt=0, i=0;
			//for(int i=0; i<accounts.size(); i++) {
			for(BankAccount acc : accounts) {
				if(acc.getBalance() > largest.getBalance()) {
					largest = acc;
					largestAt = i;
				}
				i++;
			}
			accounts.remove(largestAt);
			accounts.add(0,largest);
			
		}
	}
	
	/**Returns a boolean if the Bank ArrayList contains a specified account by looking at the ID
	 * 
	 * @param accountID The ID to be looked for
	 * @return boolean if accountLook is in the ArrayList
	 */
	public boolean contains(String accountID) {
		for(BankAccount account : accounts) {
			if(account.getAccountId().equals(accountID))
				return true;
		}
		return false;
	}
	/**Compares the accounts to a balance, if the account balance is more than the specified their Account ID will be added to an ArrayList of String to be returned
	 * 
	 * @param balance The balance to be compared to
	 * @return accOverList The ArrayList<String> of IDs over the balance
	 */
	public ArrayList<String> list(double balance){
		ArrayList<String> accOverList = new ArrayList<String>();
		for(BankAccount acc : accounts) {
			if(acc.getBalance() > balance)
				accOverList.add(acc.getAccountId());
		}
		return accOverList;
	}
	/**Returns the ArrayList of account ID numbers
	 * 
	 * @return accIdList The ArrayList of account IDs
	 */
	public ArrayList<String> list(){
		ArrayList<String> accIdList = new ArrayList<String>();
		for(BankAccount acc : accounts) {
			accIdList.add(acc.getAccountId());
		}
		return accIdList;
	}
}
