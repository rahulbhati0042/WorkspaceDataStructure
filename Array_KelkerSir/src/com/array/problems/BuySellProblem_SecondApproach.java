package com.array.problems;

public class BuySellProblem_SecondApproach {
	public static void main(String[] args) {
		int x[] = { 50, 3, 40, 60, 70, 20, 3, 40, 50, 33 };
		// int x[] = { 50,50,50,50,50 };
		// int x[] = { 50, 50, 50, 50, 50, 20 };
		int maxProfit = 0;
		int min = Integer.MAX_VALUE;
		;
		for (int e = 0; e < x.length; e++) {
			if (x[e] < min) {
				min = x[e];
			} else {
				maxProfit = Math.max(maxProfit, (x[e] - min));
			}
		}
		System.out.println("Max Profit :" + maxProfit);

	}
}
