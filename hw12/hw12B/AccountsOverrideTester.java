package hw12B;

public class AccountsOverrideTester
{

   public static void main(String[] args)
   {
      BankAccount account1 = new BankAccount(1500, "abc123");
      BankAccount account2 = new BankAccount(1500, "abc123");
      BankAccount account3 = new BankAccount(1500, "xyz789");
      
      NewWorldAccount savings1 = new NewWorldAccount(1500, "sss111", 12);
      NewWorldAccount savings2 = new NewWorldAccount(1500, "abc123", 24);
      NewWorldAccount savings3 = new NewWorldAccount(3000, "sss111", 24);
      
      System.out.println(account1.toString());
      System.out.println("Expected: BankAccount[balance=1500.0,accountId=abc123]");
      System.out.println(account3.toString());
      System.out.println("Expected: BankAccount[balance=1500.0,accountId=xyz789]");
      System.out.println(savings3);
      System.out.println("Expected: NewWorldAccount[balance=3000.0,accountId=sss111][timeToMaturity=24]");
      
      System.out.println(account1.equals(account2));
      System.out.println("Expected: true");
      System.out.println(account1.equals(account3));
      System.out.println("Expected: false");
      System.out.println("super equals sub: " + account1.equals(savings2));
      System.out.println("Expected: false");
      
      System.out.println(savings1.equals(savings2));
      System.out.println("Expected: false");
      System.out.println(savings3.equals(savings1));
      System.out.println("Expected: false");

      System.out.println("Different classes:" + savings1.equals("account"));
      System.out.println("Expected: false");
      System.out.println("null: " + savings1.equals(null));
      System.out.println("Expected: false");
   }

}