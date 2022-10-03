package com.subarray;

import java.util.HashMap;
import java.util.Map;

public class FindSumArraySum_To_Target_For_NagetiveNumber {

	public static void main(String[] args) {
		int arr[] = { 10, -3, 7, 6, -2, 4, 3, 9, -5, 12 };
		int target = 20;
		int e = 0;
		int accumulatedSum = 0;

		Map<Integer, Integer> map = new HashMap<>();
		int si = 0, ei = 0;
		while (e < arr.length) {

			accumulatedSum = accumulatedSum + arr[e];
			if (accumulatedSum == target) {
				ei = e;
				break;
			} else if (map.containsKey((accumulatedSum - target))) {
				si = map.get(accumulatedSum - target) + 1;
				ei = e;
				break;
			} else {
				map.put(accumulatedSum, e);
			}
			e++;
		}
		System.out.println("contiguous sub array indexs :(" + si + "," + ei
				+ ") Sum :" + target);
}

}