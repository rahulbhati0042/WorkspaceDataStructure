package com.arrayproblems;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, m = 3;
		int a[] = { 89, 24, 75, 11, 23 };
		int b[] = { 89, 2, 4 };
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i] == b[j])
					count++;
			}
		}
		System.out.println(count);
	}

}
