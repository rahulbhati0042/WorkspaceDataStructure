package com.gcf;

public class GreatestCommonDivisor {

	public static void main(String[] args) {

		int numA = 20;
		int numB = 30;
		int numC = 40;

		int gcd = 0;

		int e = 1;
		while (e <= numA) {

			if (numA % e == 0 && numB % e == 0 && numC % e == 0) {
				gcd = e;
			}
			e++;
		}
		System.out.println("GCD :" + gcd);
	}

}
