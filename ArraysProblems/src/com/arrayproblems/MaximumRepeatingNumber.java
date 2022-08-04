package com.arrayproblems;

public class MaximumRepeatingNumber {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 1, 2 };
		int n = arr.length;
		int k = 3;
		int karr[] = new int[k];
		int count = 0;
		for (int i = 0; i < karr.length; i++) {
			count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[j] == i) {
					count++;
				}
			}
			karr[i] = count;
		}
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < karr.length; i++) {
			if (max <= karr[i]) {
				max = karr[i];
				maxIndex = i;
			}
			
		}
		System.out.println(maxIndex);
	}
}
