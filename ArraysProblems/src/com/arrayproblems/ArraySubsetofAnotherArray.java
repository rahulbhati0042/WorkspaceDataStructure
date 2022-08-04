package com.arrayproblems;

public class ArraySubsetofAnotherArray {

	public static void main(String[] args) {
		int a1[] = { 11, 1, 13, 21, 3, 7 };
		int a2[] = { 11, 3, 7, 1 };
		int n = a1.length;
		int m = a2.length;
		String subset = "Yes";
		for (int i = 0; i < m; i++) {
			boolean check = false;
			for (int j = 0; j < n; j++) {
				if (a2[i] == a1[j])
					check = true;
			}
			if (!check) {
				subset = "No";
				System.out.println(subset);
				return;
			}
		}
		System.out.println(subset);
	}

}
