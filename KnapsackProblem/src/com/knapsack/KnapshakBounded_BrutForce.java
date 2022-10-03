package com.knapsack;

public class KnapshakBounded_BrutForce {
	static int numberOfCopies = 0;

	public static void main(String[] args) {
		int weightArray[] = { 1, 5, 10, 15, 20, 22 };
		int valueArray[] = { 5, 2, 6, 4, 5, 3 };

		int size = weightArray.length;
		int capacity = 25;

		int e = 0;
		int f = 0;
		int maxValue = 0, maxValue1 = 0;
		while (e < size) {
			int value1, value2 = 0;
			f = e + 1;
			value1 = 0;

			while (f < size) {
				if (capacity <= 0)
					break;
				value1 = value1 + valueArray[f];

				f++;

			}
			value2 = valueArray[f - 1];
			maxValue = Math.max(value1, value2);
			maxValue1 = Math.max(maxValue1, maxValue);
			e++;
		}
		System.out.println(maxValue1);
	}

}
