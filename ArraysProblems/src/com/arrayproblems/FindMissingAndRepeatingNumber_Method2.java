package com.arrayproblems;


public class FindMissingAndRepeatingNumber_Method2 {

	public static void main(String[] args) {
		// int arr[] = { 4, 3, 6, 2, 4,1 };
		int[] arr = new int[] { 3, 1, 3 };
		int n = arr.length;

		int miss = 0, repeat = 0;
		for (int i = 0; i < n; ++i) {
			if (arr[Math.abs(arr[i]) - 1] > 0)
				arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];

			else
				repeat = Math.abs(arr[i]);
		}

		for (int i = 0; i < n; ++i) {
			if (arr[i] > 0)
				miss = i + 1;
		}
		System.out.println("Missing: " + miss + " Repeating: " + repeat);
	}

}
