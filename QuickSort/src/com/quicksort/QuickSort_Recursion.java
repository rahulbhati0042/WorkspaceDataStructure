package com.quicksort;

import java.util.Arrays;

public class QuickSort_Recursion {
	static int x[] = { 36, 12, 15, 42, 4, 60, 9, 18, 75, 42 };
	static int lb = 0, ub = x.length - 1;

	public static void main(String[] args) {
		quicksort(lb, ub);
		System.out.println(Arrays.toString(x));
	}

	private static void quicksort(int lb, int ub) {
		int pp = 0;
		if (lb >= ub)
			return; // base condition
		pp = findPartitionPoint(lb, ub);
		quicksort(lb, pp - 1);
		quicksort(pp + 1, ub);

	}

	private static int findPartitionPoint(int lb, int ub) {
		int e = lb, f = ub, tmp = 0;
		while (e < f) {
			while (e < ub && x[e] <= x[lb])
				e++;
			while (x[f] > x[lb])
				f--;
			if (e < f) {
				tmp = x[e];
				x[e] = x[f];
				x[f] = tmp;
			} else {
				tmp = x[lb];
				x[lb] = x[f];
				x[f] = tmp;
			}
		}
		return f;
	}

}
