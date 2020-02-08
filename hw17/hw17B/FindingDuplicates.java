package hw17B;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
//@author arlan
public class FindingDuplicates {
	public static void main(String[] args) throws FileNotFoundException{
		File inputFile = new File("war_and_peace.txt");
		Scanner in = new Scanner(inputFile);
		Map<Integer, Set<String>> hashWords = new TreeMap<>();
		in.useDelimiter("[^A-Za-z0-9_]+");
		int wordCount = 0;
		int totalUniq = 0;
		while(in.hasNext()) {
			String word = in.next();
			int hc = word.hashCode();
			Set<String> setWord;
			if(hashWords.containsKey(hc)) {
				setWord = hashWords.get(hc);
				

			}else {
				setWord = new TreeSet<>();
			}
			setWord.add(word);
			hashWords.put(hc, setWord);
			wordCount++;
		}
		in.close();

		for(int key : hashWords.keySet()) {
			Set<String> tempSet = hashWords.get(key);
			if(tempSet.size() > 1) {
				int count=0;
				for(String word : tempSet) {
					if(count==0)
						System.out.print("["+ word);
					else 
						System.out.print(", " + word);
					count++;
				}
				System.out.println("]");
				totalUniq++;
			}
		}
		System.out.println((double)totalUniq / wordCount);
	}
}
