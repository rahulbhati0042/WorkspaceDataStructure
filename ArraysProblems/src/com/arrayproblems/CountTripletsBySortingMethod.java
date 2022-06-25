package com.arrayproblems;

import java.util.Arrays;

public class CountTripletsBySortingMethod {

	public static void main(String[] args) {
		int countTriplets = 0;
		int[] arr = { 1, 5, 3, 2 };
		Arrays.sort(arr);
		for (int i = arr.length - 1; i >= 2; i--) {

			int l = 0;
			int r = i - 1;

			while (l < r) {
				if (arr[l] + arr[r] == arr[i]) {
					countTriplets++;
					l++;
					r--;
				} else if (arr[l] + arr[r] < arr[i])
					l++;
				else
					r--;
			}
		}
		System.out.println(countTriplets);
	}

}
