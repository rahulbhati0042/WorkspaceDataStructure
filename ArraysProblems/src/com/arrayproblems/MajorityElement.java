package com.arrayproblems;

public class MajorityElement {

	public static void main(String[] args) {
		int majority = -1;
		// int A[] = { 1, 2, 3 };
		int A[] = { 3, 1, 3, 3, 2 };
		int appears = Math.abs((A.length / 2));

		for (int i = 0; i < A.length; i++) {
			int count = 1;
			for (int j = i + 1; j < A.length; j++) {
				if (A[i] == A[j])
					count++;
			}
			if (count > appears) {
				majority = A[i];
				break;
			}
		}
		System.out.println(majority);

	}
}
