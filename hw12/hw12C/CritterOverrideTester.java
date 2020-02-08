package hw12C;

public class CritterOverrideTester
{
   public static void main(String[] args)
   {
      Critter critter = new Critter(25.2);
      System.out.println(critter.toString());
      System.out.println("Expected: Critter[position=0,weight=25.2,history=[]]");
      critter.move(15);
      critter.move(-20);
      System.out.println(critter.toString());
      System.out.println("Expected: Critter[position=-5,weight=25.2,history=[move to 15, move to -5]]");
      
      LethargicCritter lethargic = new LethargicCritter(10.1);
      System.out.println(lethargic.toString());
      System.out.println("Expected: LethargicCritter[position=0,weight=10.1,history=[]][timeToEat=true]");
      lethargic.move(2);
      lethargic.move(5);
      lethargic.move(1);
      System.out.println(lethargic.toString());
      System.out.println("Expected: LethargicCritter[position=0,weight=10.1,history=[eat, sleep, eat]][timeToEat=false]");
      
      
      Critter critter2 = new Critter(25.2);
      critter2.move(15);
      System.out.println(critter.equals(critter2));
      System.out.println("Expected: false");
      critter2.move(-20);
      System.out.println(critter.equals(critter2));
      System.out.println("Expected: true");
      
      LethargicCritter lethargic2 = new LethargicCritter(10.1);
      System.out.println(lethargic.equals(lethargic2));
      System.out.println("Expected: false");
      lethargic2.move(1);
      lethargic2.move(1);
      lethargic2.move(1);
      System.out.println(lethargic.equals(lethargic2));
      System.out.println("Expected: true");
      
      LethargicCritter lethargic3 = new LethargicCritter(10.1);
      Critter critter3 = new Critter(10.1);
      System.out.println("super equals sub: " + lethargic3.equals(critter3));
      System.out.println("Expected: false");
      
      System.out.println("Different classes:" + critter.equals("dog"));
      System.out.println("Expected: false");
      System.out.println("null: " + critter.equals(null));
      System.out.println("Expected: false");
      
   }
}