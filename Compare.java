package sortingGenerically;

import java.util.Comparator;

public class Compare<T extends Comparable<T>> implements Comparator<T> {

	@Override
	public int compare(T shoe1, T shoe2) {
		
		return shoe1.compareTo(shoe2);
	}
	

}
