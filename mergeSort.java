package sortingGenerically;

import java.util.Arrays;

public class mergeSort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void merge(int leftFirst, int leftLast, int rightFirst, int rightLast, T[] array){
        T[] tempArray = Arrays.copyOf(array,array.length);
        int index = leftFirst;
        int saveFirst = leftFirst;

        while((leftFirst <= leftLast) && (rightFirst <= rightLast)){
            if(array[leftFirst].compareTo(array[rightFirst]) < 0){
                tempArray[index] = array[leftFirst];
                leftFirst++;
            }else{
                tempArray[index] = array[rightFirst];
                rightFirst++;
            }
            index++;
        }
        while(leftFirst <= leftLast){
            tempArray[index] = array[leftFirst];
            leftFirst++;
            index++;
        }
        while(rightFirst <= rightLast){
            tempArray[index] = array[rightFirst];
            rightFirst++;
            index++;
        }
        for(index = saveFirst; index <= rightLast;index++){
            array[index] = tempArray[index];
        }
    }
    public static <T extends Comparable<T>> void mergeSort(int first, int last,T[] array){
        if(first < last){
            int middle = (first + last) / 2;
            mergeSort(first,middle,array);
            mergeSort(middle+1,last,array);
            merge(first,middle,middle+1,last,array);
        }
    }
}
