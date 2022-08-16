package com.heapsort;

import java.util.Arrays;

public class ArrayToMaxHeap {

	public static void main(String[] args) {
		int arr[] = { 16, 52, 73, 84, 9, 56, 120, 60, 12, 35 };
		int y = 1;
		int ci = 0, ri = 0;
		while (y < arr.length) {
			ci = y;
			while (ci > 0) {
				ri = (ci - 1) / 2;
				if (arr[ci] > arr[ri]) {
					int g = arr[ci];
					arr[ci] = arr[ri];
					arr[ri] = g;

					ci = ri;
				} else {
					break;
				}
			}
			y++;

		}
		System.out.println(Arrays.toString(arr));
	}

}
