package com.recursion.problems;

public class PalindromeProblem {
	static int arr[] = { 1, 2, 3, 4, 3, 2, 1 };

	public static void main(String[] args) {
		System.out.println(palindrome(0));
	}

	private static boolean palindrome(int i) {
		if (i >= arr.length / 2)
			return true;

		if (arr[i] != arr[arr.length - i - 1]) {
			return false;
		}
		return palindrome(i + 1);

	}

}