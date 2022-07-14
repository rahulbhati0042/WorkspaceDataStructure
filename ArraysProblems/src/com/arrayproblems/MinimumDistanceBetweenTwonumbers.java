package com.arrayproblems;

public class MinimumDistanceBetweenTwonumbers {

	public static void main(String[] args) {
		int arr[] = { 3, 5, 4, 2, 6, 3, 0, 0, 5, 4, 8, 3 };
		int n = arr.length;
		int x = 3;
		int y = 6;
		int i = 0, p = -1, min_dist = Integer.MAX_VALUE;

		for (i = 0; i < n; i++) {
			if (arr[i] == x || arr[i] == y) {
				if (p != -1 && arr[i] != arr[p])
					min_dist = Math.min(min_dist, i - p);
				p = i;
			}
		}
		if (min_dist == Integer.MAX_VALUE)
			System.out.println(-1);
		System.out.println(min_dist);

	}

}
