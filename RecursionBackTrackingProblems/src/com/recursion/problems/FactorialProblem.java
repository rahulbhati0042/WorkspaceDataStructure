package com.recursion.problems;

public class FactorialProblem {

	public static void main(String[] args) {
		int fac = factorial(5);
		System.out.println("Factorial of 5 is :" + fac);
	}

	private static int factorial(int n) {
		if (n == 1)
			return 1;
		return n * factorial(n - 1);
	}
}
