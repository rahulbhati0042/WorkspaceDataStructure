package com.arrayproblems;

import java.util.Arrays;

public class MergeTwoSortedArrayWithoutExtraSpace {
	public static void main(String[] args) {
		long[] a = { 13, 17, 18, 19, 20, 22, 22, 27, 36, 39, 46, 48, 50 };
		long[] b = { 4, 12, 45 };
		for (int i = 0; i < a.length; i++) {

			if (a[i] > b[0]) {
				long temp = a[i];
				a[i] = b[0];
				b[0] = temp;
				for (int j = 0; j < b.length; j++) {
					if (j + 1 <= b.length - 1 && b[j] > b[j + 1]) {
						temp = b[j];
						b[j] = b[j + 1];
						b[j + 1] = temp;
						continue;
					} else
						break;

				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
