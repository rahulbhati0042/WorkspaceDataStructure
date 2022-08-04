package com.arrayproblems;

import java.util.Arrays;

public class MinimizeSumOfProduct {

	public static void main(String[] args) {
		int a[] = { 6, 1, 9, 5, 4 };
		int b[] = { 3, 4, 8, 2, 4 };
		Arrays.sort(a);
		Arrays.sort(b);
		long minValue = 0;
		int i = 0;
		for (int j = a.length - 1; j >= 0; j--, i++) {
			minValue = minValue + (a[i] * b[j]);

		}
		System.out.println(minValue);
	}

}
