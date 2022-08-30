package com.bubblesort;

import java.util.Arrays;

public class BubbleSort_Recursion {
	static int arr[] = { 0, 1, 0, 1, 0, 1, 0, 1 };
	static int tmp = 0;

	public static void main(String[] args) {
		recursionF1(arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	private static void recursionF1(int m) {
		if (m == 0)
			return;
		recursionF2(0, m);
		recursionF1(m - 1);
	}

	private static void recursionF2(int e, int m) {
		if (e == m)
			return;
		int f = e + 1;
		if (arr[e] > arr[f]) {
			tmp = arr[e];
			arr[e] = arr[f];
			arr[f] = tmp;
		}
		recursionF2(e + 1, m);
	}
}