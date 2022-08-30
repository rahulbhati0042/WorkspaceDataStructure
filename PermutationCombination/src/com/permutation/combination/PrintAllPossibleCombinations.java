package com.permutation.combination;

public class PrintAllPossibleCombinations {
	static int count = 0;
	public static void main(String[] args) {
		int set[] = { 0, 1, 2, 3 };
		int digit = 3;
		int setSize = set.length;
		printAllCombinations(set, setSize, digit);
		System.out.println("Number of Combinations :" + count);
	}

	private static void printAllCombinations(int set[], int setSize,
			int maxLength) {
		__printAllCombinations("", set, setSize, maxLength);
	}

	private static void __printAllCombinations(String seed, int[] set,
			int setSize, int maxLength) {

		if (maxLength == 0) {
			count++;
			System.out.println(seed);
			return;
		}
		String str = seed;
		for (int i = 0; i < setSize; i++) {
			str = str + "" + set[i];
			__printAllCombinations(str, set, setSize, maxLength - 1);
			str = seed;
		}
	}
}