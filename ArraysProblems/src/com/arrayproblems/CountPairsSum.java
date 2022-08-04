package com.arrayproblems;


public class CountPairsSum {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 7, 1 };
		int k = 6;
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] < k) {
				for (int j = i + 1; j < n; j++) {
					if (arr[i] + arr[j] == k)
						count++;
				}
			}
			System.out.println("Count :" + count);
		}
	}
}
