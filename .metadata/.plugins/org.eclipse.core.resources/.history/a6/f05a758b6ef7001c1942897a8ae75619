package com.arrayproblems;

import java.util.Arrays;

public class ConvertArrayZigZagFashion {

	public static void main(String[] args) {
		int a[] = { 4, 3, 7, 8, 6, 2, 1 };
		// Zikzag --- less then greater then
		// a < b > c < d > e < f > g

		for (int i = 1; i < a.length; i += 2) {
			if (a[i - 1] > a[i])
				swip(a, i, i - 1);

			if (i + 1 < a.length && (a[i + 1] > a[i]))
				swip(a, i, i + 1);
		}
		System.out.println(Arrays.toString(a));

	}

	private static void swip(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
