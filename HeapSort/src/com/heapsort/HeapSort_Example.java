package com.heapsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HeapSort_Example {
	public static void main(String[] args) {
		// Array should be Max Heap
		int arr[] = { 120, 73, 84, 60, 35, 52, 56, 16, 12, 9 };
		int y = arr.length - 1;
		int ri = 0;
		int lci = 0, rci = 0, swi = 0;
		while (y > 0) {
			int g = arr[y];
			arr[y] = arr[0];
			arr[0] = g;
			y--; // array from 0 to 8
			ri = 0;
			while (ri < y) {
				lci = (ri * 2) + 1;
				if (lci > y)
					break;
				rci = lci + 1;

				if (rci > y) {
					swi = lci;

				} else {
					if (arr[lci] > arr[rci]) {
						swi = lci;
					} else {
						swi = rci;
					}
				}
				if (arr[swi] > arr[ri]) {
					int tmp = arr[swi];
					arr[swi] = arr[ri];
					arr[ri] = tmp;
					ri = swi;
				} else {
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}