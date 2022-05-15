package com.arrayproblems;

import java.util.Arrays;

public class ArrayRotationMethod_2 {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 }; // [3,4,5,1,2]
		int tmp;
		for (int i = 0; i < 2; i++) {
			tmp = arr[0];
			int j;
			for (j = 0; j < arr.length - 1; j++) {

				arr[j] = arr[j + 1];

			}
			arr[j] = tmp;

		}
		System.out.println(Arrays.toString(arr));
	}
	

}
