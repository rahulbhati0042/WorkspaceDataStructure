package com.arrayproblems;

import java.util.Arrays;

public class SwapKthElements {

	public static void main(String[] args) {
		//int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int arr[] = { 55, 100 ,33, 61};
		int n = arr.length;
		//int k = 3;
		int k = 4;
		if (n >= k) {
			int temp = arr[k - 1];
			arr[k - 1] = arr[n - k];
			arr[n - k] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
