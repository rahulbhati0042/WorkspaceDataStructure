package com.linearsort;

import java.util.Arrays;

public class LinearSort_Recursion {
	static int arr[] = {0,10,0,0,0,2, 1, 9 };

	public static void main(String[] args) {
		recursionF1(0);
		System.out.println(Arrays.toString(arr));
	}

	private static void recursionF1(int e) {
		if (e == arr.length)
			return;
		recursionF2(e, e + 1);
		recursionF1(e+1) ;
	}

	private static void recursionF2(int e, int f) {

		if (f == arr.length)
			return;
		if (arr[e] > arr[f]) {
			int tmp = arr[e];
			arr[e] = arr[f];
			arr[f] = tmp;
		}
		recursionF2(e, f + 1);
		
	}

}