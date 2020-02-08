package hw14A;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//@author arlan
public class GroceryCart
{
   public static void main(String[] args) throws FileNotFoundException
   {
      String fileName = "items.txt"; //SUB "items2.txt"
      File inputFile = new File(fileName);
      Scanner in = new Scanner(inputFile, "UTF-8");
      String line ="";
      double totalCost = 0;
      double price = 0;
      int quantity = 0;
      double cost = 0;
      String firstLine = in.nextLine();
      while(in.hasNext()) {
    	  if(in.hasNextDouble())
    		  price = in.nextDouble();
    	  if(in.hasNextInt()) {
    		  quantity = in.nextInt();
    		  cost = price * quantity;
    	  	  totalCost += cost;
    	  	  //System.out.print(line);
    	  	  System.out.printf("%-20s%10.2f", line, price);
    	  	  System.out.printf("%8s", quantity);
    	  	  System.out.printf("%8.2f", cost);
    	  	  System.out.println();
    	  	  line = "";
    	  }
    	  if(in.hasNext()) {
    		  line += in.next() + " ";
    	  }
      }
      System.out.printf("Total: $%.2f", totalCost);
      in.close();
   }
}