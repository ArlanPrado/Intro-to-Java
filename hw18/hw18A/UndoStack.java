package hw18A;

import java.util.Stack;
//@author arlan
public class UndoStack {
	Stack<String> undo;
	
	public UndoStack() {
		undo = new Stack<>();
	}
	public void add(String phrase) {
		undo.push(phrase);
	}
	public String undo() {
		if(undo.isEmpty())
			return null;
		return undo.pop();
	}
	public void undoAll() {
		undo.removeAllElements();
	}
}
