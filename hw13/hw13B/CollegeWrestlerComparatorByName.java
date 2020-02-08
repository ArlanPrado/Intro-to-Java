package hw13B;

import java.util.Comparator;

public class CollegeWrestlerComparatorByName implements Comparator<CollegeWrestler>{
	@Override
	public int compare(CollegeWrestler o1, CollegeWrestler o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}
