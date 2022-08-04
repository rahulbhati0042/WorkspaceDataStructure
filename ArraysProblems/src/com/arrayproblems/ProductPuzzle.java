package com.arrayproblems;

import java.util.Arrays;

public class ProductPuzzle {

	public static void main(String[] args) {
		int nums[] = { 10, 3, 5, 6, 2 };
		int n = nums.length;
		long product[] = new long[n];
		long prod = 1;
		for (int i = 0; i < n; i++) {
			prod = 1;
			for (int j = 0; j < n; j++) {
				if (i != j) {
					prod = prod * nums[j];
				}
			}
			product[i] = prod;
		}
		System.out.println(Arrays.toString(product));
	}

}
