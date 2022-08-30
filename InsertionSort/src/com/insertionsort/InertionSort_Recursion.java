package com.insertionsort;

import java.util.Arrays;

public class InertionSort_Recursion {
	static int arr[] = { 0, 1, 0, 1, 01, 10 };

	public static void main(String[] args) {

		recursion(1);
		System.out.println(Arrays.toString(arr));
	}

	private static void recursion(int y) {
		if (y == arr.length)
			return;
		int num = arr[y];
		int z = y - 1;
		while (z >= 0 && arr[z] > num) {
			arr[z + 1] = arr[z];
			z--;
		}
		arr[z + 1] = num;
		recursion(y + 1);
	}

}