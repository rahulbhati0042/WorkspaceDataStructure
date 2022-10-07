package com.array.problems;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[] = { 5, 0, 4, 3, 1 };
		System.out.println("Missing Number :" + getMissingNumber(arr));
	}

	private static int getMissingNumber(int[] arr) {
	int sum = 0;
		int e = 0;
		int n = arr.length;
		for (e = 0; e < n; e++)
			sum = sum + arr[e];
		int result = ((n * (n + 1)) / 2) - sum;
		return result;
	}

}
