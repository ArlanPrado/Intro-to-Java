package hw17C;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
//@author arlan
public class IndexMaker
{
   public static void main(String[] args) throws FileNotFoundException
   {
	   
	   String filename = "ProcessRectangle.java"; 
	   File file = new File(filename);
	   Scanner scan = new Scanner(file);
	   Scanner scan2 = new Scanner(new File("reserved.txt"));
	   Map<String, Set<Integer>> identifiers = new TreeMap<>();
	   
	   Set<String> reserved = new HashSet<>();
	   while(scan2.hasNext()) {
		   reserved.add(scan2.next());
	   }
	   scan2.close();
	   int lineNum = 0;
	   int num1;
	   while(scan.hasNextLine()) {
		   String line = scan.nextLine();
		   Scanner scan3 = new Scanner(line);
		   scan3.useDelimiter("[^A-Za-z0-9_]+");
		   lineNum++;
		   while(scan3.hasNext()) {
			   if(scan3.hasNextInt())
				   num1 = scan3.nextInt();
			   else {
				   String word = scan3.next();
				   if(!reserved.contains(word)){
					   Set<Integer> integerSet;
					   if(identifiers.containsKey(word)) {
						   integerSet = identifiers.get(word);
					   }else {
						   integerSet = new TreeSet<>();
					   }
					   integerSet.add(lineNum);
					   identifiers.put(word, integerSet);
				   }
			   }
		   }
	   }
	   scan.close();
	   
	   for(String key : identifiers.keySet()) {
		   	System.out.print(key +": ");
		   	Set<Integer> tempSet = identifiers.get(key);
		   	int count = 0;
		   	for(int num : tempSet) {
		   		if(count == 0)
		   			System.out.print("[" + num);
		   		else if(count != 0)
		   			System.out.print(", "+num);
		   		count++;
			}
		   	System.out.print("]");
			System.out.println();
		   }
	   }
   }
