package com.arrayproblems;

public class SubarrayWithGivenSum {

	public static void main(String[] args) {
		// int A[] = { 1, 2, 3, 7, 5 };
		int A[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int startIndex = 0, endIndex = 0, totalSum = 0, s = 15;
		boolean first = false;
		for (int i = 0; i < A.length; i++) {
			totalSum = totalSum + A[i];
			if (totalSum == s && !first) {
				startIndex = i + 1;
				endIndex = i + 1;
				break;
			}
			for (int j = i + 1; j < A.length; j++) {
				totalSum = totalSum + A[j];
				if (totalSum == s && !first) {
					startIndex = i + 1;
					endIndex = j + 1;
					first = true;
					break;
				} else if (totalSum > s)
					break;
			}
			totalSum = 0;
		}
		System.out.println("startIndex :" + startIndex);
		System.out.println("endIndex :" + endIndex);

	}

}
