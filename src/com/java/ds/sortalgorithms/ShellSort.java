package com.java.ds.sortalgorithms;

public class ShellSort {

	public static void main(String[] args) {

		int[] array = { 3, 99, -7, 39, -22, 55, 21 };

		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				int temp = array[i];
				int j = i;
				while (j >= gap && array[j - gap] > temp) {
					array[j] = array[j - gap];
					j -= gap;

				}
				array[j] = temp;
			}
		}

		for (int i = 0; i < array.length - 1; i++) {
			System.out.println("Array Value " + array[i]);
		}
	}

}
