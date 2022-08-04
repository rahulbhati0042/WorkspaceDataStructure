package com.arrayproblems;

public class SumArrayPuzzle_M2 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + arr[i];
		}
		for (int i = 0; i < n; i++) {
			arr[i] = sum - arr[i];
			System.out.print(arr[i] + " ");
		}
	}
}
