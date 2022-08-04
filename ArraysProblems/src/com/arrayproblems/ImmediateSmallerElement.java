package com.arrayproblems;

import java.util.Arrays;

public class ImmediateSmallerElement {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 1, 5, 3 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int v = -1;
			if (i + 1 < n && arr[i] > arr[i + 1]) {
				v = arr[i + 1];
			}
			arr[i] = v;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
