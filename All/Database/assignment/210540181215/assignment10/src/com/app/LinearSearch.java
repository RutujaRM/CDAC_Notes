package com.app;

public class LinearSearch {

	public static boolean linearSearch(int arr[], int e) {
		for (int i : arr) {
			if (e == i)
				return true;
		}
		return false;
	}
}
