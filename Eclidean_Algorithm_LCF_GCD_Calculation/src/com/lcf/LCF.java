package com.lcf;

public class LCF {
	public static void main(String[] args) {

		int numA = 75;
		int numB = 50;

		int productOfTwoNo = numA * numB;
		int gcd = 0;
		int e = 1;
		while (e <= numA) {

			if (numA % e == 0 && numB % e == 0) {
				gcd = e;
			}
			e++;
		}
		int lcf = productOfTwoNo / gcd;
		System.out.println("Lowest Common Factor :" + lcf);
	}
}
