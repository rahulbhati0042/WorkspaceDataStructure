package com.arrayproblems;

public class ArrayCountInversions {

	public static void main(String[] args) {
		long arr[] = { 2, 4, 1, 3, 5 };
		int N = 5;
		long count = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j] && i < j)
					count++;
			}
		}
		System.out.println(count);
	}

}
