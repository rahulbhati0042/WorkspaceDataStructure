package com.oddevensorting;

import java.util.Arrays;

public class Odd_Even_Sorting_WhileLoop {

	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,1,0};
		int swapCount = 1;
		int e = 0, f = 0, tmp = 0;
		while (swapCount > 0) {
			swapCount = 0;
			// odd sorting
			e = 1;
			f = e + 1;
			while (f < arr.length) {
				if (arr[e] > arr[f]) {
					tmp = arr[e];
					arr[e] = arr[f];
					arr[f] = tmp;
					swapCount = 1;
				}
				e = f + 1;
				f = e + 1;
			}
			// even sorting
			e = 0; f = e + 1;
			while (f < arr.length) {
				if (arr[e] > arr[f]) {
					tmp = arr[e];
					arr[e] = arr[f];
					arr[f] = tmp;
					swapCount = 1;
				}
				e = f + 1;
				f = e + 1;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
