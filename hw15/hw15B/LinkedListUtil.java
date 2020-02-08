package hw15B;

import java.util.LinkedList;
import java.util.ListIterator;
//@author arlan
public class LinkedListUtil {
	public static void shrink(LinkedList<String> strings, int n) {
		ListIterator<String> iter = strings.listIterator(n-1);
		int index = n;
		while(iter.hasNext()) {
			iter.next();
			if(index%n==0)
				iter.remove();
			index++;
		}
	}
	public static LinkedList<String> reverse(LinkedList<String> strings){
		ListIterator<String> iter = strings.listIterator(strings.size());
		LinkedList<String> reversed = new LinkedList<>();
		while(iter.hasPrevious()) {
			String temp = iter.previous();
			reversed.add(temp);
		}
		return reversed;
	}
}
