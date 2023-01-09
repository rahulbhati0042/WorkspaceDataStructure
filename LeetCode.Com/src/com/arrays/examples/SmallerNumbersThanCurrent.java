package com.arrays.examples;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {
	public static void main(String[] args) {
		int arr[] = { 8, 1, 2, 2, 3 };
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int e = 0;
		int f = 0;
		int smallerNum[] = new int[nums.length];
		while (e < nums.length) {
			f = e + 1;
			while (f < nums.length) {
				if (nums[e] > nums[f])
					smallerNum[e]++;
				else if(nums[e] < nums[f])
					smallerNum[f]++;
				f++;
			}
			e++;
		}
		return smallerNum;
	}
}
