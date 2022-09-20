package com.subarray;

public class FindSumArraySum_To_Target_SlidingWindow {

	public static void main(String[] args) {
		int arr[] = { 5,7,2,2,4,6,1 };
		int target = 11;
		int e = 1;
		int si = 0, ei = 0;
		int sum = arr[0];
		if (sum == target) {
			System.out.println("contiguous sub array indexs :(" + si + "," + ei
					+ ") Sum :" + target);
			return;
		}
		while (e < arr.length) {
			sum = sum + arr[e];
			if (sum == target) {
				ei = e;
				break;
			} else if (sum > target) {
				sum = sum - arr[si];
				si++;
				if (sum == target) {
					ei = e;
					break;
				}

			}
			e++;
		}
		System.out.println("contiguous sub array indexs :(" + si + "," + ei
				+ ") Sum :" + target);
	}

}
