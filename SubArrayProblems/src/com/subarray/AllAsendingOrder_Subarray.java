package com.subarray;

public class AllAsendingOrder_Subarray {

	public static void main(String[] args) {
		int arr[] = { 12, 3, 92, -3, 76, 54, 12, 93, 78 };
		int previous = 0;
		int e = 0;
		int f = 0;
		int flag[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (e = 0; e <= 7; e++) {
			if (flag[e] == 1)
				continue;
			previous = e;
			for (f = e + 1; f <= 8; f++) {
				if (arr[f] > arr[previous]) {
					System.out.print(arr[previous] + ",");
					previous = f;
					flag[f] = 1;
				}
			}
			if (previous > e) {
				System.out.print(arr[previous]);
			}
			System.out.println();

		}
	}

}
