package com.arrayproblems;

import java.util.Arrays;

public class ArrayRotationMethod_2 {
	public static void main(String[] args) {
		//int[] arr = new int[] { 1, 2, 3, 4, 5 }; // [3,4,5,1,2]
		int[] arr = new int[]{25, 6 ,20, 55 ,69, 5, 50, 63 ,61, 41 ,87 ,80, 2, 96, 77 ,70, 12, 43, 31, 8, 64, 41 ,
		68, 18, 95, 79 ,52, 74, 1 ,98 ,3 ,26, 3, 74 ,32, 23, 79, 81, 37, 39, 21,
		24, 18, 22, 71 ,47, 44};
		int tmp;
		for (int i = 0; i < 47; i++) {
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
