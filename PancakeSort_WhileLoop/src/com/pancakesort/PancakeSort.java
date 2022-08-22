package com.pancakesort;

import java.util.Arrays;

public class PancakeSort {

	public static void main(String[] args) {
		int arr[] = { 18, 5, 96, 45, 2, 0, 5, 7, 9, 8, 4, 5, 1 };
		int m = arr.length - 1;
		int l = 0, h = 0;
		while (m >= 0) {
			int mi = 0, max = 0, e = 0;
			while (e <= m) {
				if (max < arr[e]) {
					max = arr[e];
					mi = e;
				}
				e++;
			}
			l = 0;h = mi;
			while (l < h) {
				int tmp = arr[l];
				arr[l] = arr[h];
				arr[h] = tmp;
				l++;
				h--;
			}
			l = 0;h = m;
			while (l < h) {
				int tmp = arr[l];
				arr[l] = arr[h];
				arr[h] = tmp;
				l++;
				h--;
			}
			m--;
		}
		System.out.println(Arrays.toString(arr));
	}

}