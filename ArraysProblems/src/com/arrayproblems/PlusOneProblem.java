package com.arrayproblems;

import java.util.Arrays;


public class PlusOneProblem {
	public static void main(String[] args) {
		int[] digits = { 4, 3, 2, 1 };
		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				System.out.println(digits);
			}
			digits[i] = 0;
		}
		
		
		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;
		System.out.println(Arrays.toString(digits));
	}
}
