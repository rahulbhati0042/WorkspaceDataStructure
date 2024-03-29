package com.arrayproblems;

import java.util.ArrayList;

public class Java1D2DProblem {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[] = { 3, 6, 9 };
		int m = 0;
		int n = a.length;
		int max = 0;
		for (int i = 0; i < n; i++) {
			m = m + a[i][i];
			max = Math.max(max, b[i]);
		}

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(m);
		list.add(max);
		System.out.println(list);
	}
}
