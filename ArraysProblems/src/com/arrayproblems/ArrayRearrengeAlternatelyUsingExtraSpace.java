package com.arrayproblems;

import java.util.Arrays;

public class ArrayRearrengeAlternatelyUsingExtraSpace {
	public static void main(String[] args) {
		// int a[]= {1,2,3,4,5,6};
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
		int temp[] = a.clone();
		int low = 0, high = a.length - 1;
		boolean flag = true;

		for (int i = 0; i < a.length; i++) {
			if (flag)
				a[i] = temp[high--];
			else
				a[i] = temp[low++];

			flag = !flag;
		}
		System.out.println(Arrays.toString(a));

	}
}
