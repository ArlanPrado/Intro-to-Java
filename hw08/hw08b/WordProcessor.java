package hw08b;

/**Word processor class that creates a new array of string to be manipulated by its own 
 * 
 * @author arlan
 *
 */
public class WordProcessor {
	String[] wordArr;
	public static final int INITIAL_CAPACITY = 8;
	
	/**Constructor that initializes the array to a set size
	 * 
	 */
	public WordProcessor() {
		wordArr = new String[INITIAL_CAPACITY];
	}
	/**Manipulator that adds a new String to the next empty space, if full it will double its size
	 * 
	 * @param toAdd New String to be added into the array
	 */
	public void add(String toAdd) {
		for(int i=0; i <= wordArr.length; i++) {
			if(i==wordArr.length) {
				this.add(toAdd, i);
				break;
			}
			else if(wordArr[i] == null) {
				wordArr[i] = toAdd;
				break;
			}
		}
	}
	/**Add string at an index, if the index is out of bounds, the array would double in length
	 * 
	 * @param toAdd
	 * @param index
	 */
	public void add(String toAdd, int index) {
		if(index >= wordArr.length) {
			String[] copy = wordArr;
			String[] wordArr = new String[copy.length*2];
			int counter =0;
			for(String element : copy) {
				wordArr[counter] = element;
				counter++;
			}
			wordArr[index] = toAdd;
			this.wordArr = wordArr;			
		}
		else
			wordArr[index] = toAdd;
	}
	
	/**Removes the Strings that are the same and are next to each other
	 * 
	 */
	public void removeAdjacentDuplicates() {
		String prevElement = "";
		int index = 0; //index at last 
		for(int i=0; i<wordArr.length; i++) {
			if(i==0) {
				prevElement = wordArr[i];
				index = i+1;
			}
			else if(prevElement == wordArr[i])
				wordArr[i] = null;
			else if(prevElement == null && wordArr[i] != null) {
				wordArr[index] = wordArr[i];
				index++;
			}
			else
				prevElement = wordArr[i];
		}	
	}
	
	/**Prints the word array but it does not print the null parts
	 * 
	 */
	public String toString() {
		String temp = "";
		for(int i=0; i<wordArr.length; i++) {
			if(i==0)
				temp += "[" + wordArr[i];
			/*
			else if(i==wordArr.length-1 || this.isRestNull(i)) {
				temp += ", " + wordArr[i-1] + "]";
				break;
			}
			*/
			else if(i==wordArr.length-1) {
				temp += ", " + wordArr[i] + "]";
				break;
			}
			else if(this.isRestNull(i) && i!=wordArr.length-1) {
				temp += ", " + wordArr[i] + "]";
				break;
			}
			else if(wordArr[i] == null)
				temp += "";
			else
				temp += ", " + wordArr[i];
		}
		return temp;
	}
	/**Checks if the rest of the elements in the array are null
	 * if so, then return true
	 * @param index The index at which it is being tested at
	 * @return boolean
	 */
	private boolean isRestNull(int index){
		for(int i = index+1; i<wordArr.length; i++) {
			if(wordArr[i] != null)
				return false;
		}
		return true;
	}
}
