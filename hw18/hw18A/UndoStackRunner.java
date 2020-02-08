package hw18A;

public class UndoStackRunner
{

   public static void main(String[] args)
   {
      UndoStack words = new UndoStack();
      words.add("Mary had a");
      words.add("tiny lamp");
      words.undo();
      words.add("little lamb.");
      words.add("I's ");
      words.undo();
      words.add("It's");
      words.add("fleece");
      words.add("was");
      words.add("white as snow.");
      
      String removed;
      while ((removed = words.undo()) != null)
      {
         System.out.println(removed);
      }

      words.add("End of story");
      words.undoAll();
      
      if ((words.undo()) == null)
      {
         System.out.println("Can not undo. History is empty.");
      }
   }

}