package com.arrayproblems;

import java.util.Arrays;

public class CyclicallyRotationArrayProblem {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		int a = arr[arr.length - 1];

		for (int j = arr.length - 1; j > 0; j--) {

			arr[j] = arr[j - 1];

		}
		arr[0] = a;
		System.out.println(Arrays.toString(arr));

	}

}
