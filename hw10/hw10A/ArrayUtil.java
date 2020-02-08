package hw10A;

import java.util.ArrayList;
/**Array Utility class that performs a range of functions without any instance variables
 * 
 * @author arlan
 *
 */
public class ArrayUtil {
	/**This returns the integer with the smallest number
	 * 
	 * @param array The integer array to look through
	 * @return minNum The smallest number in the array
	 */
	public static int min(int[] array) {
		if(array.length==0)
			return Integer.MIN_VALUE;
		int minNum = array[0];
		for(int num : array) {
			if(num < minNum)
				minNum = num;
		}
		return minNum;
	}
	/**Performs a count of how many words start with a specified letter in an array
	 * 
	 * @param array The String array that contains the words
	 * @param letter The letter to look for - case insensitive 
	 * @return count The number of words that start with the letter
	 */
	public static int contains(String[] array, String letter) {
		int count=0;
		letter=letter.toLowerCase();
		for(String word : array) {
			word=word.toLowerCase();
			if(word.substring(0,1).equals(letter))
				count++;
		}
		return count;
	}
	/**Returns an ArrayList of Strings of words that have the specified letter
	 * 
	 * @param list The String array to search through
	 * @param letter The specified letter to look for
	 * @return containsList The ArrayList of all the words with the specified letter
	 */
	public static ArrayList<String> contains(String[] list, char letter){
		char upper = Character.toUpperCase(letter);
		char lower = Character.toLowerCase(letter);
		char temp;
		ArrayList<String> containsList = new ArrayList<String>();

		for(String word : list) {
			int i = 0;
			boolean isFlag = false;
			while(isFlag==false && i<word.length()) {
				temp = word.charAt(i);
				if(temp == upper || temp == lower) {
					containsList.add(word);
					isFlag = true;
				}
				i++;
			}
		}
		return containsList;
		}
}

