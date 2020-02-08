package hw16A;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
//@author arlan
public class TextCondensor {
	ArrayList<String> list;
	
	public TextCondensor(ArrayList<String> list) {
		this.list = list;
	}

	public Set<String> condenseText(){
		Set<String> condenseSet = new TreeSet<>();
		for(int i=0; i < list.size(); i++) {
			condenseSet.add(list.get(i));
		}
		return condenseSet;
		
	}
	public int condensedSize() {
		Set<String> condenseSet = condenseText();
		return condenseSet.size();
		
	}
	public void setList(ArrayList<String> newText) {
		list = newText;
	}
	public double relativeSize() {
		int size = list.size();
		int condensedSize = condensedSize();
		return ( (double) condensedSize / size) * 100;
	
	}
}
