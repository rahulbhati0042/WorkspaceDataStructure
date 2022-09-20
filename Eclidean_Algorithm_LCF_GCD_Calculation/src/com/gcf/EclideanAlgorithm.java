package com.gcf;

public class EclideanAlgorithm {
	public static void main(String[] args) {
		int numA = 30;
		int numB = 42;

		int e = numB;
		int f = numA;
		if (numA > numB) {
			e = numA;
			f = numB;
		}

		while (f != 0 && (e / f) != 0) {
			int t = e;
			e = f;
			f = t%f;
		}
		System.out.println(e);

	}
}
