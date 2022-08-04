package com.arrayproblems;

import java.util.Arrays;

public class ArrangingArray {

	public static void main(String[] args) {
		long arr[] = { -3, 3, -2, 2 };
		int n = arr.length;
		long temp[] = new long[arr.length];
		int j = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] >= 0) {
				temp[j] = arr[i];
				j++;
			}
			arr[i] = temp[i];
		}
		System.out.println(Arrays.toString(arr));
	}

}
