package hw18B;
//@author arlan
public class ToDoItem implements Comparable{
	String description;
	int priority;

	
	public ToDoItem(String desc, int prio) {
		description = desc;
		priority = prio;
	}
	public String getDesc() {
		return description;
	}
	public int getPrio() {
		return priority;
	}
	public boolean equals(Object arg0) {
		if(arg0.getClass() != this.getClass() || arg0 == null) {
			return false;
		}
		ToDoItem other = (ToDoItem) arg0;
		if(description == other.description && priority == other.priority)
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Object arg0) {
		ToDoItem other = (ToDoItem) arg0;
		
		if(priority < other.priority)
			return -1;
		else if(priority > other.priority)
			return 1;
		return description.compareTo(other.description);
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		int compareNum = Integer.compare(this.priority, other.priority);
		if(compareNum == 0)
			compareNum = this.description.compareTo(other.description);
		return compareNum;
		*/
		
	}
	
	public String toString() {
		String toDoString = getClass().getName() + "[description=" + description + ",priority=" + priority +"]";
		return toDoString;
	}
}
