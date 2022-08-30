package com.permutation.combination;

public class StringCombination {
	static char tmp;
	static char[] arr;

	public static void main(String[] args) {
		String str = "abcd";
		int s = 0;
		int e = str.length() - 1;

		__printAllCombinations(str, s, e);

	}

	private static void __printAllCombinations(String seed, int s, int e) {
		if (s == e) {
			System.out.println(seed);
			return;
		}
		String str = seed;
		for (int i = s; i <= e; i++) {
			arr = str.toCharArray();
			tmp = arr[s];
			arr[s] = arr[i];
			arr[i] = tmp;
			str = String.valueOf(arr);
			__printAllCombinations(str, s + 1, e);
			tmp = arr[s];
			arr[s] = arr[i];
			arr[i] = tmp;
			str = String.valueOf(arr);
		}
	}
}
