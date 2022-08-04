package com.recursion.problems;

public class LinearlyPrintNumbers {
	public static void main(String[] args) {
		linearlyPrint(1, 10);
	}

	public static void linearlyPrint(int num, int n) {
		if (num > n) {
			return;
		}
		System.out.println(num);
		linearlyPrint(num+1, n);
	}
}
