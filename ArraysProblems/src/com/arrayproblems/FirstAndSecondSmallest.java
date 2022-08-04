package com.arrayproblems;

import java.util.Arrays;

public class FirstAndSecondSmallest {

	public static void main(String[] args) {
		long a[] = { 4, 3, 7, 8, 6, 2, 1 };
		int n = a.length;
		long first = 0;
		long second = 0;
		long min[] = new long[2];
		min[0] = -1;
		if (n <= 1) {
			System.out.println(min);
		}
		first = Math.min(a[0], a[1]);
		second = Math.max(a[0], a[1]);

		for (int i = 2; i < n; i++) {
			if (a[i] < first) {
				second = first;
				first = a[i];
			} else if (a[i] > first && a[i] < second) {
				second = a[i];
			}
		}
		if (first != second) {
			min[0] = first;
			min[1] = second;
		}
		System.out.println(Arrays.toString(min));
	}

}
