package com.arrayproblems;

import java.util.Arrays;

public class ArrayItemPairSum {

	public static void main(String[] args) {
		int a[] = { 11, 15, 6, 8, 9, 11 };
		/*
		 * int x = 26; for (int i = 0; i < a.length - 1; i++) { for (int j = i +
		 * 1; j < a.length; j++) { if (a[i] + a[j] == x) {
		 * System.out.println(a[i] + " + " + a[j] + " = " + x); } } }
		 */
		Arrays.sort(a);
		int l = 0, h = a.length - 1;
		int k = 26;
		int count = 0;
		while (l < h) {
			if (a[l] + a[h] == k) {
				count++;
				l++;
			} else if (a[l] + a[h] > k)
				h--;
			else
				l++;
		}
		System.out.println(count);
	}

}
