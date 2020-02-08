package hw12A;

//@author arlan
public class PolymorphismRunner {
	public static void main(String[] args) {
		BankAccount bankList[] = new BankAccount[5];
		bankList[0] = new BankAccount(1000, "00");
		bankList[1] = new StudentAccount(1000, "01");
		bankList[2] = new NewWorldAccount(3000, "02", 12);
		bankList[3] = new StudentAccount(1000,"03");
		bankList[4] = new NewWorldAccount(2000, "04", 24);
		
		for(BankAccount account : bankList) {
			account.deposit(200);
		}
		
		for(BankAccount account : bankList) {
			account.endOfMonth();
		}
		
		for(BankAccount account : bankList) {
			account.withdraw(100);
		}
		
		for(BankAccount account : bankList) {
			account.endOfMonth();
			System.out.println("Balance: " + String.format("%.2f", account.getBalance()));

			if(account instanceof NewWorldAccount) {
				System.out.println("Time to Maturity: " + ((NewWorldAccount)account).getTimeToMaturity());
			}
		}
				
	}
}
