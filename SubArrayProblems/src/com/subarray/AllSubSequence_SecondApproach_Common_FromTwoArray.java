package com.subarray;

public class AllSubSequence_SecondApproach_Common_FromTwoArray {
	public static void main(String[] args) {
		///int x[] = { 65, 66, 67, 68 };
		//int y[] = { 66, 90, 68 };
		int x[] = { 12, 3, 92, 12, 93, 78 };
		int y[] = { 54, 12, 93, 78 ,93, 78};
		int tmpX[] = new int[x.length];
		int tmpXi = 0;

		int lenX = x.length;
		int lenY = y.length;

		int XEP, e, j, numX, upperBoundX;
		int YEP, numY, upperBoundY;

		int tmpY[] = new int[y.length];
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
				if (tmpXi == tmpYi) {
					for (e = 0; e < tmpXi; e++) {
						if (tmpX[e] != tmpY[e])
							break;
					}
					if (e == tmpXi) {
						for (e = 0; e < tmpXi; e++)
							System.out.print(tmpX[e] + ",");
						System.out.println();
						break;
					}
				}
				numY++;
			}
			numX++;
		}
	}
}
