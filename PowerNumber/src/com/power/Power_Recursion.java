package com.power;

public class Power_Recursion {
	static int numberOfCopies = 0;
	public static void main(String[] args) {
		int x = 5;
		int y = 5;
		
		int result = powerRecursion(x, y);
		System.out.println(result);
		System.out.println("numberOfCopies :"+numberOfCopies);
	}

	private static int powerRecursion(int x, int y) {
		numberOfCopies++;
		if (y == 1)
			return x;

		return x * powerRecursion(x, y - 1);

	}

}
