package com.gcf;

public class EclideanAlgorithm_Recursion {
	public static void main(String[] args) {
		int numA = 18;
		int numB = 30;

		int e = numB;
		int f = numA;
		if (numA > numB) {
			e = numA;
			f = numB;
		}
		recursion(e, f);
	}

	public static void recursion(int p, int q) {
		if (q == 0) {
			System.out.println(p);
			return;

		}
		recursion(q, p % q);
	}
}
