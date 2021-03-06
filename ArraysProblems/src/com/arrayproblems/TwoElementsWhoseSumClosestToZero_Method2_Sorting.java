package com.arrayproblems;

import java.util.Arrays;

public class TwoElementsWhoseSumClosestToZero_Method2_Sorting {

	public static void main(String[] args) {
		//int arr[] = { 1, 60, -10, 70, -80, 85 };
		int arr[] = {-8, -66, -60};
		int sum;
		int n = arr.length;
		Arrays.sort(arr);
		int l = 0, r = n - 1;
		int closestSum = Integer.MAX_VALUE;
		while (l < r) {
			 sum = arr[l] + arr[r];
			if (Math.abs(closestSum) > Math.abs(sum)) {
				closestSum = sum;
			}
			else if (Math.abs(closestSum) == Math.abs(sum)) {
				closestSum = Math.max(closestSum,sum);
			}
			if (sum < 0)
				l++;
			else
				r--;
		}
		System.out.println(closestSum);
	}

}
