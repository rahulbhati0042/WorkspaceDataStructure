package com.arrayproblems;

import java.util.Arrays;

public class QuickLeftRotation {

	public static void main(String[] args) {
		long arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 101;
		int n = arr.length;
		if (k > n) {
			k = k % n;
		}
		long tmp[] = new long[k];
		for (int i = 0; i < k; i++) {
			tmp[i] = arr[i];
		}
		int j = 0;
		for (int i = k; i < n; i++) {
			arr[j] = arr[i];
			j++;
		}
		for (int i = 0; i < k; i++) {
			arr[j] = tmp[i];
			j++;
		}

		System.out.println(Arrays.toString(arr));
	}

}