package com.subarray;

public class AllSubSequence_SecondApproach_Common_FromTwoArray_Length {
	public static void main(String[] args) {
		int x[] = { 65, 66, 67, 68 };
		int y[] = { 66, 90, 68 };
		int maxSS=0;
		int tmpX[] = new int[4];
		int tmpXi = 0;

		int lenX = 4;
		int lenY = 3;

		int XEP, e, j, numX, upperBoundX;
		int YEP, numY, upperBoundY;

		int tmpY[] = new int[3];
		int tmpYi = 0;

		upperBoundX = lenX - 1;
		upperBoundY = lenY - 1;

		XEP = (int) Math.pow(2, lenX) - 1;
		YEP = (int) Math.pow(2, lenY) - 1;
		// for X array
		numX = 1;
		while (numX <= XEP) {
			tmpXi = 0;
			for (e = upperBoundX; e >= 0; e--) {
				j = numX >> e;
				if ((j & 1) == 1) {
					// System.out.print(x[upperBoundX - e] + ",");
					tmpX[tmpXi] = x[upperBoundX - e];
					tmpXi++;
				}
			}
			numY = 1;
			while (numY <= YEP) {
				tmpYi = 0;
				for (e = upperBoundY; e >= 0; e--) {
					j = numY >> e;
					if ((j & 1) == 1) {
						// System.out.print(x[upperBoundX - e] + ",");
						tmpY[tmpYi] = y[upperBoundY - e];
						tmpYi++;
					}
				}
				// a subsequnce of y array is ready in tmpy, we need to compare
				// it tmpx
				if (tmpXi == tmpYi && tmpXi>maxSS) {
					for (e = 0; e < tmpXi; e++) {
						if (tmpX[e] != tmpY[e])
							break;
					}
					if (e == tmpXi) {
						maxSS=tmpXi;
						break;
					}
				}
				numY++;
			}
			numX++;
		}
		System.out.println("Longest Common SubSequnce Length :"+maxSS);
	}
}