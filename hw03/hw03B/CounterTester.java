package hw03B;

public class CounterTester
{

   public static void main(String[] args)
   {
      Counter machine = new Counter();
      machine.voteYes();
      machine.voteYes();
      System.out.println("Yes: " + machine.getYesVotes());
      System.out.println("Expected: 2" );
      machine.voteYes();
      machine.voteNo();
      machine.voteYes();
      machine.voteNo();
      System.out.println("No: " + machine.getNoVotes());
      System.out.println("Expected: 2" );
      machine.voteNo();
      
      System.out.println("Yes: " + machine.getYesVotes());
      System.out.println("Expected: 4" );
      System.out.println("No: " + machine.getNoVotes());
      System.out.println("Expected: 3" );
      
   }
}
