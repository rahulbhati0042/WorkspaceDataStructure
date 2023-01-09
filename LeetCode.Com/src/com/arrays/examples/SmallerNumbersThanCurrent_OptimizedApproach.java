package com.arrays.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumbersThanCurrent_OptimizedApproach {
	public static void main(String[] args) {
		int arr[] = { 8, 1, 2, 2, 3 };
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
	}

	public static int[] smallerNumbersThanCurrent(int[] nums) {
		int smallerNum[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			smallerNum[i] = nums[i];
		}
		Arrays.sort(nums);
		Map<Integer, Integer> map = new HashMap<>();

		for (int e = nums.length - 1; e >= 0; e--) {
			map.put(nums[e], e);
		}
		for (int i = 0; i < nums.length; i++) {
			smallerNum[i]=map.get(smallerNum[i]);
		}
		return smallerNum;
	}
}
