package com.linearsort;

import java.util.Arrays;

public class LinearSort_WhileLoop {

	public static void main(String[] args) {
		int arr[] = { 44, 11, 99, 77, 33, 22, 55 };
		int e = 0;
		int f = 0;
		while (e < arr.length) {
			f = e + 1;
			while (f < arr.length) {
				if (arr[e] > arr[f]) {
					int temp = arr[e];
					arr[e] = arr[f];
					arr[f] = temp;
				}
				f++;
			}
			e++;
		}
		System.out.println(Arrays.toString(arr));

	}

}
