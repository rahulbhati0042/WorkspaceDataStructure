package com.recursion.problems;

public class FabonacciSeriesProblem {
	// 0,1,1,2,3,5,8,13,21
	public static void main(String[] args) {
		System.out.println(fabonachiNumber(8));
	}

	private static int fabonachiNumber(int n) {
		if (n <= 1)
			return n;

		return fabonachiNumber(n - 1) + fabonachiNumber(n - 2);
	}

}
