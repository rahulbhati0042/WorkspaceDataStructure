package com.arrayproblems;

public class StockBuSellToMaximizeProfit {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 10, 6, 4, 8, 1 };
		int max_diff = arr[1] - arr[0];
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] - arr[i] > max_diff)
					max_diff = arr[j] - arr[i];
			}
		}
		System.out.println(max_diff);
	}

}
