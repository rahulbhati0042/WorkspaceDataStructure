package com.arrayproblems;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int peak = 0;
		int arr[] = { 1, 2, 3 };
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (i + 1 < n && arr[i] < arr[i + 1]) {
				peak = i + 1;
			}
		}
		System.out.println(peak);
	}

}
