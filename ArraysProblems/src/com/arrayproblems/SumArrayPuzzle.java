package com.arrayproblems;

public class SumArrayPuzzle {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					sum = sum + arr[j];
				}
			}
			System.out.print(sum + " ");
		}

	}

}
