package com.arrayproblems;


public class IndexOfExtraElement {

	public static void main(String[] args) {
		int n = 7;
		int a[] = { 2, 4, 6, 8, 9, 10, 12 };
		int b[] = { 2, 4, 6, 8, 10, 12 };
		for (int i = 0; i < n; i++) {
			if (i > b.length - 1) {
				System.out.println(i);
				break;
			} else if (a[i] != b[i]) {
				System.out.println(i);
				break;
			}

		}
		//System.out.println(-1);
		
	}

}
