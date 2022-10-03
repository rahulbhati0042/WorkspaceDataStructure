package com.subarray;

public class MaxLength_SecondApproach_FromTwoArray_Recursion {
	static int x[] = { 65, 66, 67, 68, 80, 90 };
	static int y[] = { 66, 90, 68, 90 };
	static int copies = 0;
	static int lenX = x.length;
	static int lenY = y.length;

	public static void main(String[] args) {
		System.out.println("Length of Longest Common Sequence  is "
				+ getLengthOfLCS());
		System.out.println("Number of copies generated :" + copies);
	}

	static int getLenOfLCS(int e, int f) {
		int leftSide, rightSide;
		copies++;
		if (e == lenX || f == lenY)
			return 0;
		if (x[e] == y[f])
			return 1 + getLenOfLCS(e + 1, f + 1);
		leftSide = getLenOfLCS(e + 1, f);
		rightSide = getLenOfLCS(e, f + 1);
		return (leftSide > rightSide) ? leftSide : rightSide;
	}

	static int getLengthOfLCS() {
		return getLenOfLCS(0, 0);
	}
}