package com.array.problems;

public class RangeSum {
	//static int arr[] = { 40, 5, 3, 5, 6, 2, 5, 6, 1 };
	static int arr[] = { 5,6,7,10,12,15,5,8 };
	public static void main(String[] args) {
		System.out.println("Rang sum (0,4) :" + RangSum(0, 4));
		System.out.println("Rang sum (3,4) :" + RangSum(3, 4));
		System.out.println("Rang sum (4,4) :" + RangSum(4, 4));
		System.out.println("Rang sum (5,7) :" + RangSum(5, 7));
	}

	static int RangSum(int start, int end) {
		int sum = 0;
		while (start <= end) {
			sum = sum + arr[start];
			start++;
		}
		return sum;
	}
}
