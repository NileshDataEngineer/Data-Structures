package com.java.ds.sortalgorithms;

public class SelectionSort {
	public static void main(String[] args) {

		int[] array = { 3, 99, -7, 39, -22, 55, 21 };

		for (int lstidx = array.length - 1; lstidx > 0; lstidx--) {
			int largest = 0;
			for (int i = 1; i <= lstidx; i++) {
				if (array[i] >= array[largest]) {
					largest = i;
				}
			}
			swap(array, largest, lstidx);
		}
		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("Array Value " + array[i]);
		}
	}

	public static void swap(int[] ary, int i, int j) {
		if (i == j) {
			return;
		} else {
			int temp = ary[i];
			ary[i] = ary[j];
			ary[j] = temp;

		}
	}
}
