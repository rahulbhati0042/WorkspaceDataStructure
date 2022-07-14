package com.arrayproblems;

public class PerfectArraysOrArrayPalindrome {

	public static void main(String[] args) {
		int arr[] =  {12, 35, 1, 10, 34, 1};
		int n = arr.length;
		int left = 0;
		int right = n - 1;
		while (left <= right) {
			if (arr[left] == arr[right]) {
				left++;
				right--;
			} else {
				System.out.println("NOT PERFECT");
				break;
			}

		}
		//System.out.println("PERFECT");
	}

}
