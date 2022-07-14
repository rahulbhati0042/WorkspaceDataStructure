package com.arrayproblems;

public class MinimumNumberOfJumpsProblem {

	public static void main(String[] args) {
		// int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
		// int arr[] = { 1, 4, 3, 2, 6, 7 };
		int arr[] = { 2, 3, 1, 1, 2, 4, 2, 0, 1, 1 };
		int minimumJumps = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] == 0 || i == arr.length - 1)
				break;

			minimumJumps++;

			if (i == 0) {
				i = i+1;
			}
			else{
				i = i + arr[i];
			}

		}
		System.out.println(minimumJumps);
	}

}
