package hw15A;

import java.util.ArrayList;
import java.awt.Rectangle;
//@author arlan
public class RectangleSorter{
	
	public static void sortByArea(ArrayList<Rectangle> list) {
		for(int i = 0; i < list.size(); i++) {
			int min = 0;
			boolean lessFlag = false;
			for(int j = 0 + i; j < list.size(); j++) {
				double area1 = list.get(j).getHeight() * list.get(j).getWidth();
				double area2 = list.get(i).getHeight() * list.get(i).getWidth();
				if(area1 < area2) { min = j; lessFlag = true;}
			}
			if(lessFlag) {
				Rectangle temp = list.get(i);
				Rectangle tempMin = list.get(min);
				list.set(i, tempMin);
				list.set(min,temp);
			}
		}
	}
	public static void sortByDescendingPerimeter(ArrayList<Rectangle> list) {
		int max = 0;
		for(int i = 0; i < list.size(); i++) {
			boolean moreFlag = false;
			for(int j = 0 + i; j < list.size(); j++) {
				double peri1 = (list.get(j).getHeight() + list.get(j).getWidth()) * 2;
				double peri2 = (list.get(i).getHeight() + list.get(i).getWidth()) * 2;
				if(peri1 > peri2) {
					if(!moreFlag) {
						max = j; 
						moreFlag = true;
					}
					else {
						double periPrev = (list.get(max).getHeight() + list.get(max).getWidth()) * 2;
						if(peri1 > periPrev)
							max = j;
					}
				}
			}
			if(moreFlag) {
				Rectangle temp = list.get(i);
				Rectangle tempMax = list.get(max);
				list.set(i, tempMax);
				list.set(max,temp);
			}
		}
	}
}
