package com.array.problems;

public class StairsProblem_FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		int j = 0;
		while (j <= n) {

			int result = getNumberOfWaysToClimStairs(j);
			System.out.println("Number of Stairs :" + j
					+ " & approaches to reach " + result);
			j++;
		}

	}

	private static int getNumberOfWaysToClimStairs(int stairs) {
		int e = 0, f = 0, g = 0, k = 0;
		if (stairs <= 2)
			return stairs;
		e = 1;
		f = 2;
		k = 3;
		while (k <= stairs) {
			g = e + f;
			e = f;
			f = g;
			k++;
		}
		return g;
	}

}
