package com.subarray;

public class Kadane_MaxSubArray {

	public static void main(String[] args) {
		int arr[] = { 10, -2, 7, -6, 9, 3 };
		int localMax = arr[0];
		int globalMax = arr[0];
		int e = 1;
		while (e < arr.length) {

			if (arr[e] > (localMax + arr[e])) {
				localMax = arr[e];

			} else {
				localMax = localMax + arr[e];
			}
			if (localMax > globalMax)
				globalMax = localMax;

			e++;
		}
		System.out.println(globalMax);
	}
}
