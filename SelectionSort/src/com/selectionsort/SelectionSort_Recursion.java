package com.selectionsort;

import java.util.Arrays;

public class SelectionSort_Recursion {
	static int arr[] = { 0, 0, 0, 9, 9, 0, 0, 0, 8, 8, 7, 6, 5, 4, 3, 2, 1, 8 };
	static int si = 0, tmp = 0;

	public static void main(String[] args) {
		recursionF1(0);
		System.out.println(Arrays.toString(arr));
	}
	private static void recursionF1(int e) {
		if (e == arr.length)
			return;
		si = e;
		si = recursionF2(e, e + 1);
		tmp = arr[e];
		arr[e] = arr[si];
		arr[si] = tmp;
		recursionF1(e + 1);
	}

	private static int recursionF2(int si, int f) {

		if (f == arr.length)
			return si;
		if (arr[si] > arr[f])
			si = f;
		return recursionF2(si, f + 1);
	}
}