package sortingGenerically;

import java.util.Comparator;

public class Compare<T extends Comparable<T>> implements Comparator<T> {
        //generic comparator class that is using the compare method (not the compareTo)
	@Override
	public int compare(T shoe1, T shoe2) {
		
		return shoe1.compareTo(shoe2);
	}
	

}
