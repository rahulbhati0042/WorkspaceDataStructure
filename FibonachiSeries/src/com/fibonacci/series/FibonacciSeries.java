package com.fibonacci.series;

public class FibonacciSeries {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z = 0;

		int j = 1;
		while (j <= 10) {
			System.out.print(y + ",");
			z = x + y;
			x = y;
			y = z;
			j++;
		}

	}

}
