package com.power;

public class Power_LessCopies_Recursion {
	static int x = 5;
	static int y = 10;
	static int tmpArr[] = new int[y + 1];
	static int numberOfCopies = 0;

	public static void main(String[] args) {

		for (int i = 0; i < y; i++) {
			tmpArr[i] = 0;
		}

		int result = powerRecursion(x, y);
		System.out.println(result);
		System.out.println("Number of Copies :" + numberOfCopies);
	}

	private static int powerRecursion(int x, int y) {
		numberOfCopies = numberOfCopies + 1;
		if (y == 1)
			return x;
		if (tmpArr[y] != 0)
			return tmpArr[y];
		tmpArr[y] = y % 2 == 0 ? powerRecursion(x, y / 2)
				* powerRecursion(x, y / 2) : x * powerRecursion(x, y / 2)
				* powerRecursion(x, y / 2);
		return tmpArr[y];

	}

}
