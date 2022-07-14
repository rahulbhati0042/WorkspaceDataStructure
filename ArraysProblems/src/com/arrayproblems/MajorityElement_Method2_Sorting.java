package com.arrayproblems;

import java.util.Arrays;

public class MajorityElement_Method2_Sorting {

	public static void main(String[] args) {
		int arr[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };
		int n = arr.length;
		Arrays.sort(arr);
		if (n == 1)
			System.out.println("Majority Elements :" + arr[0]);
		int count = 1, max_ele = -1, temp = arr[0], ele = 0, f = 0;
		for (int i = 1; i < n; i++) {
			if (temp == arr[i]) {
				count++;
			} else {
				count = 1;
				temp = arr[i];
			}
			if (max_ele < count) {
				max_ele = count;
				ele = arr[i];
				if (max_ele > (n / 2)) {
					f = 1;
					break;
				}
			}
		}
		if (f == 1)
			System.out.println("Majority Elements :" + ele);
		else
			System.out.println("Majority Elements :" + (-1));
	}

}
