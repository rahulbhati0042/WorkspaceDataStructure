package com.arrayproblems;

import java.util.Arrays;

public class SegregateEvenOdd {

	public static void main(String[] args) {
		int arr[] = { 12, 34, 45, 9, 8, 90, 3 };
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0)
				count++;
		}
		int even[] = new int[count];
		int odd[] = new int[n - count];
		int j = 0, k = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				even[j] = arr[i];
				j = j + 1;
			} else {
				odd[k] = arr[i];
				k = k + 1;
			}
		}
		Arrays.sort(even);
		Arrays.sort(odd);
		int a = 0, b = 0;
		for (int i = 0; i < n; i++) {
			if (i < even.length) {
				arr[i] = even[a];
				a++;

			} else {
				arr[i] = odd[b];
				b++;
			}

		}
		System.out.println(Arrays.toString(arr));
	}

}
