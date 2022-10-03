package com.find.kth;

public class FindKthElements {

	public static void main(String[] args) {
		int arr[] = { 44, 11, 99, 77, 33, 22, 55 };
		int result = findKth_Smallest(arr, 3);
		System.out.println("Kth Smallest :" + result);
	}

	private static int findKth_Smallest(int arr[], int kth) {
		int e = 0;
		int max = 0;
		while (e < arr.length) {
			max = Math.max(max, arr[e]);
			e++;
		}
		int tmp[] = new int[max + 1];
		e = 0;
		while (e < arr.length) {
			tmp[arr[e]] = 1;
			e++;
		}
		int count = 0;
		e = 0;
		while (e < tmp.length) {
			if (tmp[e] == 1) {
				count++;
				if (count == kth) {

					return e;
				}
			}
			e++;
		}
		return 0;
	}

}