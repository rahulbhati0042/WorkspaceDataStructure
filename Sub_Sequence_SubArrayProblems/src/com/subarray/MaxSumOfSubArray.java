package com.subarray;

public class MaxSumOfSubArray {

	public static void main(String[] args) {
		//int arr[] = { 1,-2,-7,6,3,9 }; -- result =18
		int arr[] = { 10,-2,7,-6,-9,3 }; //-- result = 15

		int maxSum = 0;
		int e = 0;
		int f = 0;
		while (e < arr.length) {
			f = e;
			int sum = 0;
			while (f <arr.length) {
				sum =  sum + arr[f];
				maxSum = Math.max(maxSum, sum);
				f++;
			}
			e++;
		}
		System.out.println("Max Sum :" + maxSum);
	}
}