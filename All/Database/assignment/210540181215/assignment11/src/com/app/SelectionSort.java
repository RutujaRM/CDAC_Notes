package com.app;

public class SelectionSort {

	public static int[] selectionSort(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			int min = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (min > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}
}
