package sortingGenerically;

import java.util.*;

/*
    Looks great.. Need comments at all junctures -8%. :   92% 
*/

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] shoeType = new String[5];
		Integer[] shoeModelNum = new Integer[5];
		Double[] shoePrice = new Double[5];
		
		String type;
		int modelNum;
		double price;
		for(int i = 0; i < shoeType.length; i++) {
			System.out.println("Enter Type of Shoe");
			type = input.nextLine();
			shoeType[i] = type;
			System.out.println("Enter modelNum: ");
			modelNum = input.nextInt();
			shoeModelNum[i] = modelNum;
			System.out.println("Enter price");
			price = input.nextDouble();
			input.nextLine();
			shoePrice[i] = price;

		}
		System.out.println("\nShoes Unsorted:");
		for (String i : shoeType) {
			System.out.println(i);
		}
		
		mergeSort<String> mergeShoe = new mergeSort<String>();
		mergeShoe.mergeSort(0, shoeType.length - 1, shoeType);
		
		System.out.println("\nShoes Sorted by type:");
		for (String i : shoeType) {
			System.out.println(i);
		}
		mergeShoe.mergeSort(0, shoeType.length - 1, shoeModelNum);
		System.out.println("\nShoes Sorted by Model Number:");
		for (int i : shoeModelNum) {
			System.out.println(i);
		}
		
		mergeShoe.mergeSort(0, shoeType.length - 1, shoePrice);
		System.out.println("\nShoes Sorted by Price:");
		for (double i : shoePrice) {
			System.out.println("$" + i);
		}

	}

}
