package com.array.problems;

public class MissingNumber_BitwiseOperation {

	public static void main(String[] args) {
		int arr[] = { 2, 0, 4, 3, 1 };
		System.out.println("Missing Number :" + getMissingNumber(arr));
	}

	private static int getMissingNumber(int[] arr) {
		int v = 0;
		int e = 0;
		int n = arr.length;
		for (e = 0; e < n; e++)
			v = (v ^ e) ^ arr[e];

		return v ^ e;
	}
}
