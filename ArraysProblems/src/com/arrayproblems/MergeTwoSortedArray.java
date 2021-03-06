package com.arrayproblems;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		long[] arr1 = { 13, 17, 18, 19, 20, 22, 22, 27, 36, 39, 46, 48, 50 };
		long[] arr2 = { 4, 12, 45 };
		int n = arr1.length;
		int m = arr2.length;
		long arr3[] = new long[n + m];
		int k = 0;
		for (int i = 0; i < n; i++) {
			arr3[k++] = arr1[i];
		}
		for (int i = 0; i < m; i++) {
			arr3[k++] = arr2[i];
		}
		Arrays.sort(arr3);
		k = 0;
		for (int i = 0; i < n; i++) {
			arr1[i] = arr3[k++];
		}
		for (int i = 0; i < m; i++) {
			arr2[i] = arr3[k++];
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
