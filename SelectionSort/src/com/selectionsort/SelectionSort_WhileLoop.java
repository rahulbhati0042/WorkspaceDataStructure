package com.selectionsort;
import java.util.Arrays;

public class SelectionSort_WhileLoop {

	public static void main(String[] args) {
		int arr[] = { 44, 11, 99, 77, 33, 22, 55 };
		int e = 0;
		int f = 0;
		int smallestIndex=0;
		while (e < arr.length) {
			f = e + 1;
			smallestIndex = e;

			while (f < arr.length) {

				if (arr[smallestIndex] > arr[f]) {
					smallestIndex = f;
				}
				f++;
			}
			int temp = arr[smallestIndex];
			arr[smallestIndex] = arr[e];
			arr[e] = temp;
			e++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
