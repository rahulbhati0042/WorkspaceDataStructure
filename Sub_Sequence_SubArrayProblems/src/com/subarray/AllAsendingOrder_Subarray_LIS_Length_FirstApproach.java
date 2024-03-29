package com.subarray;

// LIS - Longest Increasing Sub Sequecnce Length
public class AllAsendingOrder_Subarray_LIS_Length_FirstApproach {

	public static void main(String[] args) {
		int arr[] = { 12, 3, 92, -3, 76, 54, 12, 93, 78 };
		int previous = 0;
		int e = 0;
		int f = 0;
		int numberOfElements = 0;
		int maxSubSequence = 0;
		int flag[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (e = 0; e <= 7; e++) {
			if (flag[e] == 1)
				continue;
			previous = e;
			numberOfElements = 0;
			for (f = e + 1; f <= 8; f++) {
				if (arr[f] > arr[previous]) {
					previous = f;
					flag[f] = 1;
					numberOfElements++;
				}
			}
			if (previous > e) {
				numberOfElements++;
			}
			if (numberOfElements < maxSubSequence)
				continue;
			if (numberOfElements > maxSubSequence) {
				maxSubSequence = numberOfElements;
			}
		}
		System.out.println("Length of LIS :" + maxSubSequence);
	}
}
