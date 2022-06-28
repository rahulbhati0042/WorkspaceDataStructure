package com.arrayproblems;

public class ArrayMaximumIndex {

	public static void main(String[] args) {
		//int A[] = { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
		int A[] ={82 ,63 ,44 ,74, 82, 99, 82};
		int n = A.length;
		int maxIndexDiff = 0;
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (A[i] <= A[j] && (j - i) > maxIndexDiff)
					maxIndexDiff = Integer.max(maxIndexDiff,j - i);

			}
		}
		System.out.println(maxIndexDiff);
	}

}
