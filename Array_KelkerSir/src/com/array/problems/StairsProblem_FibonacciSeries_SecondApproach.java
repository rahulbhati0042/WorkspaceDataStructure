package com.array.problems;

public class StairsProblem_FibonacciSeries_SecondApproach {

	public static void main(String[] args) {
		int n = 10;
		int f = 0;
		int e = 1;
		int j = 0;
		while (j <= n) {

			f = f + e;
			e = f - e;
			System.out.println("Number of Stairs :" + j
					+ " & approaches to reach " + f);
			j++;
		}

	}

}