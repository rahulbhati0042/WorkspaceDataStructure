package com.fibonacci.series;

public class FibonacciSeries_Recursion {
	static int x = 0;
	static int y = 1;
	static int z = 0;

	public static void main(String[] args) {
		fibonacci(10);
	}

	public static void fibonacci(int k) {
		if (k == 0)
			return;
		System.out.print(y + ",");
		z = x + y;
		x = y;
		y = z;
		fibonacci(k - 1);
	}

}