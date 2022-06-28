package com.arrayproblems;

public class TwoElementsWhoseSumClosestToZero {

	public static void main(String[] args) {
		int arr[] = { 1, 60, -10, 70, -80, 85 };
		int n = arr.length;
		int l = 0, r = n - 1;

		int closestSum = arr[0] + arr[1];
		int element_1 = 0, element_2 = 0;
		while (l < r) {
			int sum = arr[l] + arr[r];
			if (Math.abs(closestSum) > Math.abs(sum)) {
				closestSum = sum;
				element_1 = arr[l];
				element_2 = arr[r];
			}
			if (sum < 0)
				l++;
			else
				r--;
		}

		System.out.println(closestSum);
		System.out
				.println("Element A:" + element_1 + " Element B:" + element_2);

	}

}
