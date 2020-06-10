package com.java.ds.sortalgorithms;

public class InsertionSort {

	public static void main(String[] args) {
		int[] array = { 3, 99, -7, 39, -22, 55, 21 };
		for (int firstunsortedindx = 1; firstunsortedindx < array.length; firstunsortedindx++) {

			int sortedfirst = array[firstunsortedindx];
			int i;
			for (i = firstunsortedindx; i > 0 && array[i - 1] > sortedfirst; i--) {
				array[i] = array[i - 1];
			}
			array[i] = sortedfirst;

		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("Sorted array value " + array[i]);
		}
	}

}
