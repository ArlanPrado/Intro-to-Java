package hw11A;

public class ChipsTester 
{
    public static void main(String[] args)
    {
        Chips fritos = new Chips ("Frito Lays", 2.99, 170);
        Chips kettle = new Chips("Kettle Sea Salt and Vinegar Patato Chips", 3.25, 180);
        Chips lentil = new  Chips("Daily Crave Lentil Chips", 2.50, 220);
        Product product = fritos; //fritos is a subclass of Product
        
        System.out.println(fritos.getPrice());
        System.out.println("Expected: 2.99");
        System.out.println(fritos.getSodium());
        System.out.println("Expected: 170");
        System.out.printf("Percent RDA: %.0f%n", fritos.percentOfDailyAmount());
        System.out.println("Expected: 11");
        System.out.println(fritos.getDescription());
        System.out.println("Expected: Frito Lays 170");
        
        System.out.println("price and sodium: " + kettle.getPrice() + " " + kettle.getSodium());
        System.out.println("Expected: 3.25 180");
        System.out.printf("Percent RDA: %.0f%n", kettle.percentOfDailyAmount());
        System.out.println("Expected: 12");    
        System.out.println(kettle.getDescription());
        System.out.println("Expected: Kettle Sea Salt and Vinegar Patato Chips 180");
    
        
        System.out.println("price and sodium: " + lentil.getPrice() + " " + lentil.getSodium());
        System.out.println("Expected: 2.5 220");
        System.out.printf("Percent RDA: %.0f%n", lentil.percentOfDailyAmount());
        System.out.println("Expected: 15");    
        System.out.println(lentil.getDescription());
        System.out.println("Expected: Daily Crave Lentil Chips 220");
    }
}