package com.arrayproblems;

public class SmallestPositiveMissingNumber {

	public static void main(String[] args) {
		int arr[] = { 0, -10, 1, 3, -20 };
		int missing = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == missing) {
					missing++;
					break;
				}
			}
		}
		System.out.println("Missing :" + missing);

	}

}
