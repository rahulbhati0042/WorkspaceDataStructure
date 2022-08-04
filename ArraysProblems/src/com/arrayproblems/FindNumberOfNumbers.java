package com.arrayproblems;

public class FindNumberOfNumbers {

	public static void main(String[] args) {
		int a[] = { 11, 12, 13, 14, 15 };
		int k = 1;
		int n = a.length;
		int temp = 0;
		int p = 0;
		int lastnum = 0;
		for (int i = 0; i < n; i++) {
			temp = a[i];
			while (temp > 0) {
				lastnum = temp % 10;
				if (lastnum == k) {
					p++;
				}
				temp = temp / 10;
			}
		}
		System.out.println(p);

	}
}
