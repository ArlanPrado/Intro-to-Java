package hw10A;

public class ArrayUtilTester
{

   public static void main(String[] args)
   {
      //testing min method
      int[] numbers = {5, 8, 4, 6, 2, 1, 7, 3};
      System.out.println(ArrayUtil.min(numbers));
      System.out.println("Expected: 1");

      int[] numbers2 = {2, 9, 4, 6, 5, 8, 7, 3};
      System.out.println(ArrayUtil.min(numbers2));
      System.out.println("Expected: 2");

      int[] numbers3 = {10, 9, 4, 6, 5, 8, 7, 3};
      System.out.println(ArrayUtil.min(numbers3));
      System.out.println("Expected: 3");
      
      int[] numbers4 = {}; //an array with no elements
      System.out.println(ArrayUtil.min(numbers4));
      System.out.println("Expected: -2147483648");
      
      String[] empty = new String[0]; //an array with no elements

      //testing first contains
      String[] javaIdentifiers = {"Integer", "Double", "Float", "Char",
            "Boolean", "long", "short", "byte"};
      System.out.println(ArrayUtil.contains(javaIdentifiers,"c"));
      System.out.println("Expected: 1");
      System.out.println(ArrayUtil.contains(javaIdentifiers, "x"));
      System.out.println("Expected: 0");
      System.out.println(ArrayUtil.contains(javaIdentifiers,"B"));
      System.out.println("Expected: 2");
      System.out.println(ArrayUtil.contains(empty,"B"));
      System.out.println("Expected: 0");
      
      
      //testing second contains
      
      String[] words = {"Big", "Java", "is","best", "Be", "the", "computer", "CS46A/B"};

      System.out.println(ArrayUtil.contains(words, 'e'));
      System.out.println("Expected: [best, Be, the, computer]");
      System.out.println(ArrayUtil.contains(words, 'b'));
      System.out.println("Expected: [Big, best, Be, CS46A/B]");
      System.out.println(ArrayUtil.contains(words, 'A'));
      System.out.println("Expected: [Java, CS46A/B]");
      System.out.println(ArrayUtil.contains(words, 'k'));
      System.out.println("Expected: []");
      
      System.out.println(ArrayUtil.contains(empty, 'b'));
      System.out.println("Expected: []");

   }

}