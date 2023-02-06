package sortingGenerically;

import java.util.Comparator;

public class CompareModelNumber implements Comparator<Integer>{

	@Override
	public int compare(Integer shoe1, Integer shoe2) {
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
