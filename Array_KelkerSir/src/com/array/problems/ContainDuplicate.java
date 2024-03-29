package com.array.problems;

public class ContainDuplicate {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 2, 5 };
		if (containDuplicate(arr, arr.length) == 1)
			System.out.println("True");
		else
			System.out.println("False");

	}

	private static int containDuplicate(int arr[], int size) {
		int e = 1;
		int f = 0;
		while (e < arr.length) {
			f = 0;
			while (f < e) {
				if (arr[e] == arr[f]) {
					return 1;
				}
				f++;
			}
			e++;
		}
		return 0;
	}
}
