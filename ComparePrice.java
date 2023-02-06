package sortingGenerically;

import java.util.Comparator;

public class ComparePrice implements Comparator<Double> {

	@Override
	public int compare(Double shoe1, Double shoe2) {
		if (shoe1 < shoe2) {
			return -1;
		} else {
			if (shoe1 > shoe2) {
				return 1;
			}
		}
		return 0;
	}
	

}
