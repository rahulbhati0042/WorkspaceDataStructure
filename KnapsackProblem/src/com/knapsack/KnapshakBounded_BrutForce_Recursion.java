package com.knapsack;

public class KnapshakBounded_BrutForce_Recursion {
	static int numberOfCopies = 0;

	public static void main(String[] args) {
		int weightArray[] = { 1, 5, 10, 15, 20, 22 };
		int valueArray[] = { 5, 2, 6, 4, 5, 3 };
		// int weightArray[] = { 1,5,3,7 };
		// int valueArray[] = { 5,2,1,6 };
		int size = weightArray.length;
		int capacity = 25;
		System.out
				.print("Max value that can be taken away in the knapsack with capacity 25 is ");
		int result = getKnapsackFillValue(weightArray, valueArray, size,
				capacity);
		System.out.println(result);
		System.out.println("Number Of Copies :" + numberOfCopies);
	}

	public static int getKnapsackFillValue(int weightArray[], int valueArray[],
			int size, int capacity) {
		return getKnapsack(weightArray, valueArray, size, capacity, 0);
	}

	private static int getKnapsack(int[] weightArray, int[] valueArray,
			int size, int capacity, int index) {
		int value1, value2, maxValue;
		if (capacity <= 0 || index >= size)
			return 0;
		numberOfCopies++;
		value1 = 0;
		if (weightArray[index] <= capacity)
			value1 = valueArray[index]
					+ getKnapsack(weightArray, valueArray, size, capacity
							- weightArray[index], index + 1);

		value2 = getKnapsack(weightArray, valueArray, size, capacity, index + 1);
		maxValue = Math.max(value1, value2);
		return maxValue;
	}
}
