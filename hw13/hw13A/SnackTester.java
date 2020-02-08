package hw13A;

import java.util.Arrays;

public class SnackTester
{
   public static void main(String[] args) 
   {     
      //test constructor
      Snack crunch = new Snack("Nestle's Crunch", 1.75, 9);
      Snack apple = new Snack("Apple", .75, 0);
      Snack chips = new Snack("potato chips", 1.25, 10);
      Snack snickers = new Snack("Snickers", 1.75, 9);
      
      //test is subclass
      Product testing = apple; //warning okay
      
      Snack cloned = (Snack)crunch.clone();
      
      //test equals
      System.out.println("Test equals: " + cloned.equals(crunch));
      System.out.println("Expected: true");
      System.out.println("Test equals: " + snickers.equals(crunch));
      System.out.println("Expected: false");
      
      //test clone and toString
      cloned.increasePrice(10);
      System.out.println(crunch.toString());
      System.out.println("Expected: Snack[description=Nestle's Crunch,price=1.75][gramsOfFat=9]");
      System.out.println(cloned.toString());
      System.out.println("Expected: Snack[description=Nestle's Crunch,price=1.925][gramsOfFat=9]");
      
      //test getGramsOfFat
      System.out.println(chips.getGramsOfFat());
      System.out.println("Expected: 10");
      
      //test isHealthier
      System.out.println("crunch isHealthier: " + crunch.isHealthier(snickers));
      System.out.println("Expected: false");
      System.out.println("apple isHealthier: " + apple.isHealthier(snickers));
      System.out.println("Expected: true");
      System.out.println("snickers isHealthier: " + snickers.isHealthier(apple));
      System.out.println("Expected: false");
      
      
      //test compareTo
      Snack[] snacks = {snickers, apple, chips, crunch};
      Arrays.sort(snacks);
      System.out.println(Arrays.toString(snacks));
      System.out.println("Expected: [Snack[description=Apple,price=0.75][gramsOfFat=0], Snack[description=Nestle's Crunch,price=1.75][gramsOfFat=9], Snack[description=Snickers,price=1.75][gramsOfFat=9], Snack[description=potato chips,price=1.25][gramsOfFat=10]]");
              
   }
}