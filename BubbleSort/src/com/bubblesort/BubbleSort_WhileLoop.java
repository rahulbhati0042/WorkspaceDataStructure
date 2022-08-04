package com.bubblesort;

import java.util.Arrays;

public class BubbleSort_WhileLoop {
	public static void main(String[] args) {
		int a[] = { 44, 11, 99, 77, 33, 22, 55 };
		int m = a.length - 2;
		while (m >= 0) {
			int e = 0;
			int f = 1;
			while (e <= m) {
				if (a[e] > a[f]) {
					int g = a[e];
					a[e] = a[f];
					a[f] = g;
				}
				e++;
				f++;
			}
			m--;
		}
		System.out.println(Arrays.toString(a));
	}
}
