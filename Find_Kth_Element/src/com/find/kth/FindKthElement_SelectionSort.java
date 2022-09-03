package com.find.kth;

public class FindKthElement_SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 62, 37, 49, 39, 33, 63, 91, 5, 17, 84 };
		// 5,17,33,37,39,49,62,63,84,91
		int kth = 3;
		int e = 0, f = 0, si = 0, tmp = 0;

		while (e < kth) {
			si = e;
			f = e + 1;
			while (f < arr.length) {
				if (arr[si] > arr[f]) {
					si = f;
				}
				f++;
			}
			tmp = arr[si];
			arr[si] = arr[e];
			arr[e] = tmp;
			e++;
		}
		System.out.println("Kth Smallest :" + arr[kth - 1]);
	}
}
