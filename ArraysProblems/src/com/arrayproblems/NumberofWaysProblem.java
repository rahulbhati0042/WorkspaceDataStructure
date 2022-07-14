package com.arrayproblems;

public class NumberofWaysProblem {
	public static void main(String[] args) {
		System.out.println(arrangeTiles(6));
	}

	static long arrangeTiles(int n) {
		long[] dp = new long[n + 1];
		dp[0] = 0;
		for (int i = 1; i <= n; i++) {
			// Base cases
			if (i >= 1 && i <= 3)
				dp[i] = 1;
			else if (i == 4)
				dp[i] = 2;

			else {
				dp[i] = dp[i - 1] + dp[i - 4];
			}
		}
		return dp[n];
	}
}
