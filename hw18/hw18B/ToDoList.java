package hw18B;

import java.util.PriorityQueue;
//@author arlan
public class ToDoList {
	PriorityQueue<ToDoItem> list;
	public ToDoList() {
		list = new PriorityQueue<>();
	}
	public void add(ToDoItem item) {
		list.add(item);
	}
	public ToDoItem nextItem() {
		return list.remove();
	}
	public boolean hasNext() {
		if(list.isEmpty())
			return false;
		return true;
	}
	public ToDoItem peek() {
		return list.peek();
	}
}
