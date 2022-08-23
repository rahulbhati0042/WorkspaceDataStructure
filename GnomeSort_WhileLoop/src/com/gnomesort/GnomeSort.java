package com.gnomesort;

import java.util.Arrays;

public class GnomeSort {

	public static void main(String[] args) {
		int arr[] = { 44, 11, 99, 77, 33, 22, 55 };
		int f = 0;
		while (f < arr.length) {
			if (f == 0)
				f = 1;
			while (f > 0 && f < arr.length) {
				if (arr[f] < arr[f - 1]) {
					int tmp = arr[f];
					arr[f] = arr[f - 1];
					arr[f - 1] = tmp;
					f--;
				} else
					f++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}