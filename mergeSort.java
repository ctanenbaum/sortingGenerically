package sortingGenerically;

import java.util.Arrays;

public class mergeSort<T extends Comparable<T>> {

    public static <T extends Comparable<T>> void merge(int leftFirst, int leftLast, int rightFirst, int rightLast, T[] array){
        T[] tempArray = Arrays.copyOf(array,array.length);
        int index = leftFirst; //set index to start from left
        int saveFirst = leftFirst; 
        //keep comparing until each element is split
        while((leftFirst <= leftLast) && (rightFirst <= rightLast)){
            if(array[leftFirst].compareTo(array[rightFirst]) < 0){ //if the left element is less than one on right
                tempArray[index] = array[leftFirst];               //save it in the next index in tempArray
                leftFirst++;                                       /keep moving along...
            }else{
                tempArray[index] = array[rightFirst];
                rightFirst++;
            }
            index++;
        }
        while(leftFirst <= leftLast){  //compare the left side of the split
            tempArray[index] = array[leftFirst];
            leftFirst++;
            index++;
        }
        while(rightFirst <= rightLast){  //compare the right side of the split
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
            //recursive call to keep merging
            int middle = (first + last) / 2;
            mergeSort(first,middle,array);
            mergeSort(middle+1,last,array);
            merge(first,middle,middle+1,last,array);
        }
    }
}
