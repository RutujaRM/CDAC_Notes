package com.app;

public class BinarySearch {

	private static boolean binarySearchHelper(int arr[], int ele, int left, int right) {
		if (left <= right) {
			int mid = (left + right) / 2;
			if (ele == arr[mid])
				return true;
			if (ele < arr[mid])
				return binarySearchHelper(arr, ele, left, mid - 1);
			else
				return binarySearchHelper(arr, ele, mid + 1, right);
		}
		return false;
	}

	public static boolean binarySearch(int arr[], int ele) {
		return binarySearchHelper(arr, ele, 0, arr.length - 1);
	}
}
