package hw18B;

public class ToDoRunner
{
     public static void main(String[] args)
     {
        ToDoList todo = new ToDoList();
        todo.add(new ToDoItem("sleep", 12));
        todo.add(new ToDoItem("study", 3));
        todo.add(new ToDoItem("see friends", 1));
        todo.add(new ToDoItem("eat", 5));
        todo.add(new ToDoItem("watch a movie", 4));
        todo.add(new ToDoItem("eat", 5));
        todo.add(new ToDoItem("see a movie", 3));
        System.out.println("hasNext: " + todo.hasNext());
        System.out.println("peek when queue has an item: " + todo.peek());
        
        //remove and print
        System.out.println("Remove all items  and print:");
        while(todo.hasNext())
        {
            System.out.println(todo.nextItem());
        }
        
        System.out.println("peek when queue is empty: " + todo.peek());
        System.out.println("hasNext: " + todo.hasNext());
     }
}