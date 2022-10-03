package com.palindrome;

public class Plindrome {
	public static void main(String[] args) {
		String str = "malayalam";
		System.out.println("Is " + str + " Is Palindrome :" + palindrome(str));
	}

	public static boolean palindrome(String str) {
		char q[] = new char[str.length()];

		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--, j++)
			q[j] = str.charAt(i);

		for (int i = 0; i < str.length(); i++)
			if (q[i] != str.charAt(i))
				return false;
		return true;
	}
}