package com.java.ds.sortalgorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = { 3, 99, -7, 39, -22, 55, 21 };
		for (int lstidx = array.length - 1; lstidx > 0; lstidx--) {
			for (int i = 0; i < lstidx; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
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
