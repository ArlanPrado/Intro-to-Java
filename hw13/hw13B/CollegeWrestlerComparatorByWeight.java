package hw13B;

import java.util.Comparator;

public class CollegeWrestlerComparatorByWeight implements Comparator<CollegeWrestler> {

	@Override
	public int compare(CollegeWrestler arg0, CollegeWrestler arg1) {
		// TODO Auto-generated method stub
		return Double.compare(arg0.getWeight(),arg1.getWeight());
	}
}
