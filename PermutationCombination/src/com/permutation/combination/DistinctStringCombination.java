package com.permutation.combination;

public class DistinctStringCombination {
	static char tmp;
	static char[] arr;

	public static void main(String[] args) {
		String str = "aaaa";
		int s = 0;
		int e = str.length() - 1;
		__printAllCombinations(str, s, e);
	}

	private static void __printAllCombinations(String seed, int s, int e) {
		int k;
		if (s == e) {
			System.out.println(seed);
			return;
		}
		String str = seed;
		for (int i = s; i <= e; i++) {
			arr = str.toCharArray();
			for (k = s; k < i; k++) {
				if (arr[i] == arr[k])
					break;
			}
			if (k < i)
				continue;
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
