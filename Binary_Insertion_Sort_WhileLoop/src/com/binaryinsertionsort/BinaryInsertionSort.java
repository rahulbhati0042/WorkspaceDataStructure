package com.binaryinsertionsort;

import java.util.Arrays;

public class BinaryInsertionSort {

	public static void main(String[] args) {
		int arr[] = { 45, 6, 5, 223, 5, 4, 3, 66, 5, 4, 7, 777, 55, 3, 999, 7,
				8, 0 };

		int lb = 0;
		int ub = arr.length;
		int si = 0;
		int ei = 0;
		int mid = 0;
		int num = 0;
		while (lb < ub) {
			num = arr[lb];
			si = 0;
			ei = lb;
			while (si <= ei) {

				mid = si + (ei - si) / 2;
				if (arr[mid] == num)
					break;
				else if (num < arr[mid]) {
					ei = mid - 1;
				} else {
					si = mid + 1;
				}
			}
			while (si <= lb) {
				int tmpNum = arr[si];
				int z = si - 1;
				while (z >= 0 && arr[z] > tmpNum) {
					arr[z + 1] = arr[z];
					z--;
				}
				arr[z + 1] = tmpNum;

				si++;
			}

			lb++;
		}
		System.out.println(Arrays.toString(arr));
	}

}