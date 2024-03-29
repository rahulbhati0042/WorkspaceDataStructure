package com.array.problems;

public class BuySellProblem_LinearApproach {
	public static void main(String[] args) {
		int x[] = { 50, 3, 40, 60, 70, 20, 3, 40, 50, 33 };
		// int x[] = { 50,50,50,50,50 };
		// int x[] = { 50, 50, 50, 50, 50, 20 };
		int maxProfit = 0;
		for (int e = 0; e < x.length; e++) {
			for (int f = e + 1; f < x.length; f++) {
				maxProfit = Math.max(maxProfit, (x[f] - x[e]));
			}
		}
		System.out.println("Max Profit :" + maxProfit);

	}
}
