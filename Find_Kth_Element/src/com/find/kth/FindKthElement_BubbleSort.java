package com.find.kth;

public class FindKthElement_BubbleSort {

	public static void main(String[] args) {
		int arr[] = { 62, 37, 49, 39, 33, 63, 91, 5, 17, 84 };
		// 5,17,33,37,39,49,62,63,84,91
		int kth = 4;
		int m = arr.length - 1, e = 0, f = 0, tmp = 0;
		while (m > kth - 1) {
			e = 0;
			f = 1;
			while (e < m) {
				if (arr[e] > arr[f]) {
					tmp = arr[e];
					arr[e] = arr[f];
					arr[f] = tmp;
				}
				e++;
				f++;
			}
			m--;
		}
		System.out.println("Kth Smallest :" + arr[m]);
	}
}
