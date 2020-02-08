package hw03C;

public class CityBusTester
{

   public static void main(String[] args)
   {
      CityBus train = new CityBus();
      
      System.out.println("Distance to start: " + train.distanceToStart());
      System.out.println("Expected: 0");
      System.out.println("Distance to end: " + train.distanceToEnd());
      System.out.println("Expected: 50");
      
      train.move(3);
      train.move(5);
      System.out.println("Distance to start: " + train.distanceToStart());
      System.out.println("Expected: 40");
      System.out.println("Distance to end: " + train.distanceToEnd());
      System.out.println("Expected: 10");
      
      train.turn();
      System.out.println("Distance to start: " + train.distanceToStart());
      System.out.println("Expected: 40");
      train.move(4);
      train.turn();
      train.move(2);
      System.out.println("Distance to start: " + train.distanceToStart());
      System.out.println("Expected: 30");
      System.out.println("Distance to end: " + train.distanceToEnd());
      System.out.println("Expected: 20");
   }

}