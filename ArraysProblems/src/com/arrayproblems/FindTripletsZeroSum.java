package com.arrayproblems;

public class FindTripletsZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 97, -27, 2, -34, 61, -39 };
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("Triplets");
						break;
					}
				}

			}
		}
		// System.out.println("Not Triplets");
	}

}
