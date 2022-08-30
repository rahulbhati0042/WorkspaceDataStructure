package com.cocktailshaker;

import java.util.Arrays;

public class Cocktrail_Shaker_Sort {
	public static void main(String[] args) {
		int arr[] = { 25, 92, 12, 76, 84, 32, 76 };
		int lb = 0;
		int ub = arr.length;
		int tmp = 0;
		boolean swapHappend = true;
		int e = lb;
		int f = e + 1;
		while (swapHappend) {
			swapHappend = false;
			e = lb;
			f = e + 1;
			while (f < ub) {
				if (arr[e] > arr[f]) {
					tmp = arr[e];
					arr[e] = arr[f];
					arr[f] = tmp;
					swapHappend = true;
				}
				e++;
				f++;
			}
			f--;
			e = f - 1;
			if (swapHappend) {

				while (f > lb) {
					if (arr[e] > arr[f]) {
						tmp = arr[e];
						arr[e] = arr[f];
						arr[f] = tmp;
						swapHappend = true;
					}
					f--;
					e--;
				}

			}
			lb++;
		}
		System.out.println(Arrays.toString(arr));

	}
}
