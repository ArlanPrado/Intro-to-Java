package hw17A;

import java.util.Map;
import java.util.TreeMap;

public class StudentManager {
	
	Map <String, String> students;
	public StudentManager() {
		students = new TreeMap<>();
	}
	public void add(String name, String grade) {
		students.put(name,grade);
	}
	public void remove(String name) {
		students.remove(name);
	}
	public int getClassSize() {
		return students.size();
	}
	public String getPrintableRoster() {
		String list = "";
		for(String key : students.keySet()) {
			list += key + ": ";
			list += students.get(key) + "\n";
		}
		return list;
	}
}
