package com.subarray;

public class FindSumArraySum_To_Target_Brutforce {

	public static void main(String[] args) {
		int arr[] = { -10, -2, 3, 7, -5, -8, -6, 22 };
		int target = 10;
		int e = 0;
		int si = 0, ei = 0;
		int f = 0;

		while (e < arr.length) {
			f = e + 1;

			int tmpSum = arr[e];
			while (f < arr.length) {
				tmpSum = tmpSum + arr[f];
				if (tmpSum == target) {
					si = e;
					ei = f;
					System.out.println("contiguous sub array indexs :(" + si + "," + ei
							+ ") Sum :" + target);

					break;
				}
				f++;
			}
			e++;
		}

	}

}
