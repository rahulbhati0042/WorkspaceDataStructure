package com.arrayproblems;

//Given an array of distinct integers. The task is to count all the triplets such that sum of two
//elements equals the third element.
public class CountTriplets {

	public static void main(String[] args) {

		int countTriplets = 0;
		int[] arr = { 1, 5, 3, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				for (int k = 0; k < arr.length; k++) {
					if (arr[i] + arr[j] == arr[k]) {
						countTriplets++;
					}
				}
			}

		}
		System.out.println(countTriplets);
	}

}
