package com.arrayproblems;

public class ValueEqualToIndexValue {

	public static void main(String[] args) {
		int arr[] = { 15, 2, 45, 12, 7 };
		int n = arr.length;
		for (int i = 1; i <= n; i++) {
			if (arr[i - 1] == i) {
				System.out.println(i);
			}
		}
	}

}
