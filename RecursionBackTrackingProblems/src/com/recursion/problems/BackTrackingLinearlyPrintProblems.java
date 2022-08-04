package com.recursion.problems;

public class BackTrackingLinearlyPrintProblems {
	public static void main(String[] args) {
	
		linearlyPrint(10, 10);
	}

	public static void linearlyPrint(int num, int n) {
		if (num > 0) {
			System.out.println(num);
			linearlyPrint(num-1, n);
		
		}
		return;
		
	}
}

