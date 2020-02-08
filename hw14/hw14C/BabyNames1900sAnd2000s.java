package hw14C;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
//@author arlan
public class BabyNames1900sAnd2000s {
	public static void main(String[] args) throws FileNotFoundException{
		if(args.length < 1) {
			System.out.println("Usage: java BabyNames1900sAnd2000s file1 file2");
			return;
		}
		String inFile1 = "";
		String inFile2 = "";
		for(int i=0; i < args.length; i++) {
			if(args[i].endsWith(".txt")) {
				if(inFile1.equals(""))
					inFile1 = args[i];
				else if(inFile2.equals(""))
					inFile2 = args[i];
			}
		}
		Scanner in1 = new Scanner(new File(inFile1), "UTF-8");
		Scanner in2 = new Scanner(new File(inFile2), "UTF-8");

		String line1,line2;
		ArrayList<String> names1900sM = new ArrayList<>();
		ArrayList<String> names2000sM = new ArrayList<>();
		ArrayList<String> names1900sF = new ArrayList<>();
		ArrayList<String> names2000sF = new ArrayList<>();
		for(int i = -2; i < 200; i++) {
			line1 = in1.nextLine();
			line2 = in2.nextLine();
			String words1[] = line1.split("\\t+");
			String words2[] = line2.split("\\t+");
			if(i >= 0) {
				names1900sM.add(words1[1]);
				names2000sM.add(words2[1]);
				names1900sF.add(words1[3]);
				names2000sF.add(words2[3]);
			}
		}
		ArrayList<String> namesM = new ArrayList<>();
		ArrayList<String> namesF = new ArrayList<>();
		for(int i=0; i < 200; i++) {
			String name1900M = names1900sM.get(i);
			String name1900F = names1900sF.get(i);
			for(int j=0; j < 200; j++) {
				if(name1900M.equals(names2000sM.get(j)))
					namesM.add(name1900M);
				if(name1900F.equals(names2000sF.get(j)))
					namesF.add(name1900F);
			}
		}
		namesM.sort(Comparator.naturalOrder());
		namesF.sort(Comparator.naturalOrder());
		int sizeLoop = 0;
		if(namesM.size() > namesF.size())
			sizeLoop = namesM.size();
		else
			sizeLoop = namesF.size();
		for(int i=0; i < sizeLoop; i++) {
			if(i < namesM.size())
				System.out.printf("%-30s", namesM.get(i));
			if(i < namesF.size())
				System.out.print( namesF.get(i));
			System.out.println();
		}
		
	}
}
