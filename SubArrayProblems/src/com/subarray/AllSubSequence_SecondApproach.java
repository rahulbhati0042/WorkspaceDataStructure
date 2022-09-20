package com.subarray;

public class AllSubSequence_SecondApproach {
	public static void main(String[] args) {
		int x[] = { 1,2,3,4 };
		int lenX = 4;
		int XEP, e, j, num, upperBoundX;
		upperBoundX = lenX - 1;
		XEP = (int) Math.pow(2, lenX) - 1;
		num = 1;
		while (num <= XEP) {
			for (e = upperBoundX; e >= 0; e--) {
				j = num >> e;
				if ((j & 1) == 1)
					System.out.print(x[upperBoundX - e] + ",");

			}
			System.out.println();
			num++;
		}
	}
}
