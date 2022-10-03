package com.palindrome;

public class Palindrome_SubString {
	public static void main(String[] args) {
		char str[] = { 'a', 'a', 'c', 'a', 'a', 'c' };
		int len = str.length;
		int e, f, g;
		for (e = 0; e < len; e++) {
			for (f = e; f < len; f++) {
				// e to f are palindrome or not
				String substr = "";
				for (g = e; g <= f; g++) {
					substr = substr + "" + str[g];
				}

				Data data = isPalindrome(substr);
				if (data.palindrome) {
					System.out.println(substr);
					System.out.println("Length :" + data.length
							+ " , isPalindrome :" + data.palindrome);
				}
			}
		}
	}

	public static Data isPalindrome(String str) {
		Data data = new Data();
		data.length = str.length();
		char q[] = new char[str.length()];

		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--, j++)
			q[j] = str.charAt(i);
		data.palindrome = true;
		for (int i = 0; i < str.length(); i++) {
			if (q[i] != str.charAt(i)) {
				data.palindrome = false;
				break;
			}
		}

		return data;
	}
	static class Data {
		int length;
		boolean palindrome;
	}
}
