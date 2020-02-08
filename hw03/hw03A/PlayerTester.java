package hw03A;

public class PlayerTester
{

   public static void main(String[] args)
   {
      Player player = new Player("Carlos", 32);
      System.out.println("Player: " + player.getName());
      System.out.println("Expected: Carlos" );
      
      System.out.println("has adjustment: " + player.getAdjustment());
      System.out.println("Expected: 32" );
      
      player.setAdjustment(15);
      System.out.println("now has adjustment: " + player.getAdjustment());
      System.out.println("Expected: 15" );
      
      player = new Player("JuFen", 5);
      System.out.println("Player: " + player.getName());
      System.out.println("Expected: JuFen" );
      
      System.out.println("has adjustment: " + player.getAdjustment());
      System.out.println("Expected: 5" );
      
      player.setAdjustment(3);
      System.out.println("now has adjustment: " + player.getAdjustment());
      System.out.println("Expected: 3" );
   }
}