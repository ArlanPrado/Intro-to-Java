package hw15C;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
//@author arlan
public class Roster {
	LinkedList<Student> list;
	public Roster() {
		list = new LinkedList<>();
	}
	public void add(Student s) {
		ListIterator<Student> iter = list.listIterator();
		String name = s.getName();
		boolean addFlag = false;
		while(iter.hasNext() && !addFlag) {
			String name2 = iter.next().getName();
			if(name.compareTo(name2) < 0) {
				iter.previous();
				iter.add(s);
				addFlag = true;
			}
		}
		if(!addFlag) {
			list.add(s);
		}
	}
	public void remove(String name) {
		ListIterator<Student> iter = list.listIterator();
		boolean foundFlag = false;
		while(iter.hasNext() && !foundFlag) {
			Student temp = iter.next();
			if(temp.getName().equals(name)) {
				iter.remove();
				foundFlag = true;
			}
		}
	}
	public ArrayList<String> getNames(){
		ListIterator<Student> iter = list.listIterator();
		ArrayList<String> names = new ArrayList<>();
		while(iter.hasNext()) {
			String name = iter.next().getName();
			names.add(name);
		}
		return names;
	}
}
