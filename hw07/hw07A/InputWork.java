package hw07A;

import java.util.*;
public class InputWork {

	public static void main(String[] args) {
		double input, sum=0, counter=0, minNum=0;
		boolean first = true;
		boolean firstInt = true;
		String intList = "";
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a double or Q to quit: ");
		while(scan.hasNextDouble()) {
			input = scan.nextDouble();
			if(input < 0) {
				sum += input;
				counter++;
			}
			if(input%1==0 && firstInt) {
				intList+= "" + input;
				firstInt = false;
			}
			else if(input%1==0)
				intList += ", " + input;
			if(first) {
				minNum = input;
				first = false;
			}
			else if(input < minNum) {
				minNum = input;
			}
			System.out.print("Enter a double or Q to quit: ");
		}
		if(first == false) {
			System.out.println(minNum);
			if(!intList.isEmpty())
				System.out.println(intList);
			if(counter==0)
				System.out.println(0.0);
			else
				System.out.println(sum/(counter));
		}
		else
			System.out.println("no input");
	}
}