package com.arrayproblems;

public class TotalCountProblem {

	public static void main(String[] args) {
		int k = 3;
		int arr[] = { 5, 8, 10, 13 };
		int n = arr.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] % k == 0)
				sum += arr[i] / k;
			else
				sum += arr[i] / k + 1;
		}
		System.out.println("Total Sum : " + sum);

	}
}
