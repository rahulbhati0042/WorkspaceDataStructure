package com.countersort;

import java.util.Arrays;

public class CounterSort {

	public static void main(String[] args) {
		int arr[] = { 9, 1, 3, 4, 3, 4, 3, 4, 5, 8, 0 };
		int e = 0;
		int max = 0;
		while (e < arr.length) {
			max = Math.max(max, arr[e]);
			e++;
		}
		int tmpArr[] = new int[max + 1];
		e = 0;
		while (e < tmpArr.length) {
			tmpArr[e] = 0;
			e++;
		}
		e = 0;
		while (e < arr.length) {
			tmpArr[arr[e]]++;
			e++;
		}
		e = 0;
		int c = 0;
		while (e < tmpArr.length) {
			if (tmpArr[e] > 0) {
				while (tmpArr[e] > 0) {
					arr[c] = e;
					c++;
					tmpArr[e]--;

				}
			}
			e++;
		}
		System.out.println(Arrays.toString(arr));

	}

}