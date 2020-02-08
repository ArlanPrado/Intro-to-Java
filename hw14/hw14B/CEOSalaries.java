package hw14B;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class CEOSalaries {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Usage: java CEOSalaries infile");
			return;
		}
		try {
			String inFile = "";
			for(int i=0; i < args.length; i++) {
				if(args[i].endsWith(".txt"))
					inFile = args[i];
			}
			Scanner in = new Scanner(new File(inFile), "UTF-8");
			in.useDelimiter("$");
			in.useDelimiter(",");
			int counter = 0;
			double total = 0;
			while(in.hasNextLine()) {
				String inLine = in.nextLine();
				//System.out.println(inLine);
				String words[] = inLine.split("\\t+");
				if(counter != 0) {
					System.out.println(words[0] + ": " + words[2] + " " + words[4]);
					String num = words[4].replaceAll("[$,]", "");
					total += Integer.parseInt(num);
				}
				counter++;			
			}
			System.out.printf("Average Salary: $%,.2f", total/(counter-1));
			in.close();
		}catch(FileNotFoundException fnfe) {
			System.out.println("No such file: " + fnfe.getLocalizedMessage().replace("(No such file or directory)", ""));
		}

	}

}
