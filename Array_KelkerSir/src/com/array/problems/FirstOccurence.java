package com.array.problems;

public class FirstOccurence {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 2, 3, 4, 4, 5, 6, 6 };
		int e = 0;
		int f = 0;
		while (f < arr.length) {
			e = e ^ arr[f];
			f++;
		}
		System.out.println("First occurent is :" + e);
	}
}
