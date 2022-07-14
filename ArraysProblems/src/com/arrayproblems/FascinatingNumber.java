package com.arrayproblems;

import java.util.Arrays;

public class FascinatingNumber {

	public static void main(String[] args) {
		int n = 879;
		String str = Long.toString(n) + Long.toString(n * 2)
				+ Long.toString(n * 3);
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		String str1 = "123456789";
		String str2 = String.valueOf(ch);
		if (str.length() < 9) {
			System.out.println("Not Fascinating");
		} else if (str1.equals(str2)) {
			System.out.println("Fascinating");
		} else {
			System.out.println("Not Fascinating");
		}

	}

}
