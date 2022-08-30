package com.power;

public class Power_Recursion {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		int result = powerRecursion(x, y);
		System.out.println(result);
	}

	private static int powerRecursion(int x, int y) {
		if (y == 1)
			return x;

		return x * powerRecursion(x, y - 1);

	}

}